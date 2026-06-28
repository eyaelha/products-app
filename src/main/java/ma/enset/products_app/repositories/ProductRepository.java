package ma.enset.products_app.repositories;

import ma.enset.products_app.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByNameContainingIgnoreCase(String keyword);

    List<Product> findByPriceLessThan(double maxPrice);
}
