package ro.esolutions;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ro.esolutions.repositories.UserRepository;

/**
 * Created by Bogdan Stoean on 19.02.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@SpringApplicationConfiguration(classes = Application.class)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void testNamedStoredProcedure() {
		Integer result = userRepository.calculate(10);
		Assert.assertNotNull(result);
		Assert.assertEquals(11, result, 0);
	}

	@Test
	public void testDatabaseStoredProcedure() {
		Integer result = userRepository.my_database_procedure(10);
		Assert.assertNotNull(result);
		Assert.assertEquals(11, result, 0);
	}

}
