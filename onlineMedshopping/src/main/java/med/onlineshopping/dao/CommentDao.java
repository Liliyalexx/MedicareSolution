package med.onlineshopping.dao;

import java.util.Locale.Category;
import med.onlineshopping.modal.Comment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentDao extends JpaRepository<Category, Long> {

}
