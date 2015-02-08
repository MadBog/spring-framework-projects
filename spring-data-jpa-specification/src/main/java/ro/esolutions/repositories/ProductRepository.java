package ro.esolutions.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import ro.esolutions.entities.Product;

import java.util.List;

/**
 * Created by BOGDAN on 2/8/2015.
 */
public interface ProductRepository extends CrudRepository<Product, Long>, JpaSpecificationExecutor {

    List<Product> findAll();
}
