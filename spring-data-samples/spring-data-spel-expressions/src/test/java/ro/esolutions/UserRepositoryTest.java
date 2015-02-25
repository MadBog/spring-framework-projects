package ro.esolutions;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ro.esolutions.entities.User;
import ro.esolutions.repositories.UserRepository;

import java.util.List;

/**
 * Created by Bogdan Stoean on 25.02.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void testFindAllActive() {
		List<User> users = userRepository.findAllByActive(false);
		System.out.println(users.size());
		Assert.assertEquals(3, users.size());
	}
}
