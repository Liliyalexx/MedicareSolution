package med.onlineshopping.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import med.onlineshopping.dao.CartDao;
import med.onlineshopping.dao.UserDao;
import med.onlineshopping.modal.Cart;
import med.onlineshopping.modal.User;
import med.onlineshopping.service.CartService;

@Transactional
@Component
public class CartServiceImpl implements CartService {
	
 @Autowired
 private CartDao cartDao;
	
 @Autowired
 private UserDao userDao;

 @Override
 public Cart addCartToUser(Cart cart, long idUser) {
   User user = userDao.findById(idUser).orElse(null);
   user.addCartToUser(cart);
   return userDao.save(cart);
 }

 @Override
 public void deleteCart(long id) {
   userDao.deleteById(id);
 }

 @Override
 public List<Cart> findCartsForUser(long idUser) {
   User user = userDao.findById(idUser).orElse(null);
   return user.getCarts();
 }

 @Override
 public User findCartById(long id) {
   return userDao.findById(id).orElse(null);
 }

 @Override
 public void removeFromCart(long idCart, long idUser) {
   User user = userDao.findById(idUser).orElse(null);
   Cart cart = userDao.findById(idCart).orElse(null);
   user.removeFromCart(cart);
   userDao.delete(cart);
 }

 @Override
 public Cart findByCartName(String name) {
   Optional<Cart> carts = userDao.findByName(name);
   if (carts.isPresent()) {
	Cart cart = carts.get();
    return cart;
   }
   return null;
 }

}