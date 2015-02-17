package ro.esolutions.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.esolutions.entities.User;

/**
 * Created by Bogdan Stoean on 17.02.2015.
 */
public interface UserRepository extends CrudRepository<User, Long>, UserRepositoryCustom {
}
