package lti.hola.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lti.hola.bean.RegisterBean;

//@WebServlet(name = "User", urlPatterns = { "/User.hola" })
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String referer = request.getHeader("referer");
		if (referer.contains("home.jsp")) {
			// Request coming from home for login authentication
			RegisterBean user = LoginController.authenticate(request);
			if(user !=null) {
				//login successful
				
				response.sendRedirect("profile.jsp");
			}else {
				//login failed
				response.sendRedirect("home.jsp");
			}
				
		} else if (referer.contains("register.jsp")) {
			// Request coming for user registration
			if(RegisterController.registration(request))
				response.sendRedirect("profile.jsp");
			else
				response.sendRedirect("register.jsp");
			
		} else if (referer.contains("forget.jsp")) {

			// Request coming for validating user for password change
				if(LoginController.forgetPassword(request)) {
					response.sendRedirect("change.jsp");
				}else
					response.sendRedirect("forget.jsp");
					
		} else {
			// request coming for updating password
			if(LoginController.changePassword(request)) {
				response.sendRedirect("home.jsp");
			}else
				response.sendRedirect("change.jsp");
				
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Delegating call to doGet method to perform common logic
		doGet(request, response);// method chaining
	}

}
