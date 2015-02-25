package ro.esolutions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.esolutions.entities.User;

/**
 * Created by Bogdan Stoean on 25.02.2015.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
