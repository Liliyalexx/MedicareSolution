package med.onlineshopping.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import med.onlineshopping.modal.OrderProduct;

@Validated
public interface OrderProductService {
  OrderProduct create(@NotNull(message = "The products for order cannot be null.") @Valid OrderProduct orderProduct);
}