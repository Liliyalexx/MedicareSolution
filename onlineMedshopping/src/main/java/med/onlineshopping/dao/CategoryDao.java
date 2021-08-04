package med.onlineshopping.dao;


import med.onlineshopping.modal.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Long>{

}
