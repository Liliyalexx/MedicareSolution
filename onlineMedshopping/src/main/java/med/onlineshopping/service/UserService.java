package med.onlineshopping.service;

import java.util.List;
import med.onlineshopping.modal.User;

public interface UserService {
	
  User addUser(User user);
  
  List<User> findAllUsers();
  
  User editUser(User user, long id);
  
  User findUserById(long id);
  
  void deleteUser(long id);
  
  User findByUsername(String name);
} 
