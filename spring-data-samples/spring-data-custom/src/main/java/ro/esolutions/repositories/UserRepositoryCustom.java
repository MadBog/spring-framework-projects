package ro.esolutions.repositories;

import ro.esolutions.entities.User;

import java.util.List;

/**
 * Created by Bogdan Stoean on 17.02.2015.
 */
public interface UserRepositoryCustom {

	List<User> myCustomBatchOperation();
}
