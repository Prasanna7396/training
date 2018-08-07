package lti.hola.service;

import java.util.Base64;
import java.util.Base64.Encoder;

import lti.hola.bean.ForgetBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.RegisterBean;
import lti.hola.repo.UserRepository;
import lti.hola.repo.UserRepositoryImpl;

public class UserServiceImpl implements UserService {

	private UserRepository repo;

	public UserServiceImpl() {
		repo = new UserRepositoryImpl();
	}

	@Override
	public RegisterBean authenticate(LoginBean login) {
		// Password Encoding
		Encoder encoder = Base64.getEncoder();
		String encoded = encoder.encodeToString(login.getPassword().getBytes());
		login.setPassword(encoded);
		return repo.authenticate(login);
	}

	@Override
	public boolean validate(ForgetBean forget) {
		Encoder encoder = Base64.getEncoder();
		forget.setmovie(encoder.encodeToString(forget.getmovie().getBytes()));
		return repo.validate(forget);
	}

	@Override
	public boolean persist(RegisterBean register) {
		Encoder encoder = Base64.getEncoder();
		register.setPassword(encoder.encodeToString(register.getPassword().getBytes()));
		register.setmovie(encoder.encodeToString(register.getmovie().getBytes()));
		return repo.persist(register);
	}

	@Override
	public boolean changePassword(LoginBean login) {
		Encoder encoder = Base64.getEncoder();
		login.setPassword(encoder.encodeToString(login.getPassword().getBytes()));
		return repo.changePassword(login);

	}

}
