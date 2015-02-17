package ro.esolutions;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ro.esolutions.entities.User;
import ro.esolutions.repositories.UserRepository;

import java.util.List;

/**
 * Created by Bogdan Stoean on 17.02.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CustomRepositoryConfig.class)
public class UserRepositoryCustomTest {

	@Autowired
	private UserRepository userRepository;


	@Test
	public void testCustomMethod(){
		List<User> users = userRepository.myCustomBatchOperation();
		System.out.println(users.size());
		Assert.assertEquals(10, users.size());
	}
}
