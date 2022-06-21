package guru.springframework.orderservice.services;

import guru.springframework.orderservice.domain.Product;

/**
 * Created by jt on 6/21/22.
 */
public interface ProductService {

    Product saveProduct(Product product);

    Product updateQOH(Long id, Integer quantityOnHand);
}
