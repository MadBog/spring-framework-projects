package ro.esolutions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.esolutions.entities.ZipCode;

/**
 * Created by Bogdan Stoean on 02.03.2015.
 */
public interface ZipCodeRepository extends JpaRepository<ZipCode, Long> {

	ZipCode findByCode(String code);
}
