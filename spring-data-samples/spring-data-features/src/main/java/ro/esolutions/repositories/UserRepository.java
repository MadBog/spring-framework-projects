package ro.esolutions.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.CrudRepository;
import ro.esolutions.entities.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by Bogdan Stoean on 14.02.2015.
 */
public interface UserRepository extends CrudRepository<User, Long>, UserRepositoryCustom {


    User getByUsername(String username);

    Optional<User> findByUsername(String username);

    List<User> findByFirstName(String firstName);

    Page<User> findByLastName(String lastName, Pageable pageable);

    Slice<User> findByRoleOrderByUsernameAsc(String role, Pageable pageable);

    List<User> findFirst5ByUsernameStartingWithOrderByEmailDesc(String username);

    List<User> findTop5By();
}
