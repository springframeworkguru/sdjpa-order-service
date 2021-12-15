package guru.springframework.orderservice.repositories;

import guru.springframework.orderservice.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}