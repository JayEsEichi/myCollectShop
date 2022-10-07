package sparta.project.mycollectshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sparta.project.mycollectshop.Entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByUserId(Long userId);
}