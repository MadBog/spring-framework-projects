package ro.esolutions.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.esolutions.entities.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by Bogdan Stoean on 14.02.2015.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	User getByUsername(String username);

	Optional<User> findByUsername(String username);

	List<User> findByFirstName(String firstName);

	Page<User> findByLastName(String lastName, Pageable pageable);

	Slice<User> findByRoleOrderByUsernameAsc(String role, Pageable pageable);

	List<User> findFirst5ByUsernameStartingWithOrderByEmailDesc(String username);

	List<User> findTop5By();

	@Query(value = "SELECT * FROM USER WHERE USERNAME = ?1", nativeQuery = true)
	User findByNativeSQL(String username);

	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("update User u set u.firstName = ?1 where u.username = ?2")
	int updateFirstName(String firstName, String username);
}
