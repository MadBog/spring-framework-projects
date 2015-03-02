package ro.esolutions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.esolutions.entities.Person;
import ro.esolutions.entities.ZipCode;

import java.util.List;

/**
 * Created by Bogdan Stoean on 25.02.2015.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

	List<Person> findByUserActive(boolean active);

	//List<Person> findByAddressZipCode(ZipCode zipCode);

	List<Person> findByAddress_ZipCode(ZipCode zipCode);
}
