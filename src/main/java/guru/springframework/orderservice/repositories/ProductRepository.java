package guru.springframework.orderservice.repositories;

import guru.springframework.orderservice.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jt on 12/11/21.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
