package med.onlineshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import med.onlineshopping.modal.OrderProduct;

public interface OrderProductDao extends JpaRepository<OrderProduct, Long>{

}
