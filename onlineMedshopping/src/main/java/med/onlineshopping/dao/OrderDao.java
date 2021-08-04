package med.onlineshopping.dao;



import med.onlineshopping.modal.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order, Long> {

}


