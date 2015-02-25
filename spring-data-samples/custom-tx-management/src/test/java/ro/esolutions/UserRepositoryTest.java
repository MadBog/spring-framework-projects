package ro.esolutions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import ro.esolutions.entities.User;
import ro.esolutions.repositories.UserRepository;

import java.util.List;

/**
 * Created by Bogdan Stoean on 25.02.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CustomTransactionManagement.class)
@EnableTransactionManagement
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void testFindAll(){
		List<User> users = userRepository.findAll();
		System.out.println(users.size());
	}
}
