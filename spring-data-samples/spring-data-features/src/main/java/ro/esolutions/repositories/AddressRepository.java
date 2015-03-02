package ro.esolutions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.esolutions.entities.Address;

/**
 * Created by Bogdan Stoean on 02.03.2015.
 */
public interface AddressRepository extends JpaRepository<Address, Long> {
}
