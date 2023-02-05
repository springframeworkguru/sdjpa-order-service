package guru.springframework.orderservice.services;

import guru.springframework.orderservice.domain.Product;

public interface ProductService {

    Product saveProduct(Product product);

    Product updateQuantityOnHand(Long id, Integer quantityOnHand);
}
