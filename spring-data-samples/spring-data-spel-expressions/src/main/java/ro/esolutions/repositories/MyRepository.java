package ro.esolutions.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
import ro.esolutions.entities.AbstractEntity;

import java.util.List;

/**
 * Created by Bogdan Stoean on 25.02.2015.
 */
@NoRepositoryBean
public interface MyRepository<T extends AbstractEntity> extends Repository<T, Long> {

	@Query("select t from #{#entityName} t where t.active = ?1")
	List<T> findAllByActive(boolean active);

}
