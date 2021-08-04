package med.onlineshopping.dao;

import java.util.Optional;
import med.onlineshopping.modal.Cart;

import org.springframework.data.jpa.repository.JpaRepository;

import med.onlineshopping.modal.Cart;

public interface CartDao extends JpaRepository<Cart, Long>{
	Optional<Cart> findByName(String name);

}
