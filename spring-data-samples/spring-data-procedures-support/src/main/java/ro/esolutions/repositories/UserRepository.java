package ro.esolutions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import ro.esolutions.entities.User;

/**
 * Created by Bogdan Stoean on 19.02.2015.
 */
public interface UserRepository extends JpaRepository<User, Long> {

	@Procedure(name = "User.my_procedure")
	Integer calculate(@Param("arg") Integer arg);


	@Procedure
	Integer my_database_procedure(Integer arg);

}
