package in.main.service;

import java.util.List;

import in.main.entity.User;

public interface UserService {

	User saveUser(User user);
	List<User> getAllUser();
	User getUser(String userId);
	
}
