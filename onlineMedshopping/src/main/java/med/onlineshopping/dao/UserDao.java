package med.onlineshopping.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import med.onlineshopping.modal.User;

public interface UserDao extends JpaRepository<User, Long>{
	 Optional<User> findByUsername(String name);
	}