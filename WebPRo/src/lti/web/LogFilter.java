package lti.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class LogFilter implements Filter {

    public LogFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//
		System.out.println("IP Addr: "  + request.getRemoteAddr());
		System.out.println("Time: " + new Date());
		
		//
		
		chain.doFilter(request, response);
		
		
		PrintWriter out =response.getWriter();
		out.println("<hr><p align=center> &copy; CopyRight 2020 LTI </p>");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
