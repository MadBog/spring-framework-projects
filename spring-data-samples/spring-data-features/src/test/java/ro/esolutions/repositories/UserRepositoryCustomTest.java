package ro.esolutions.repositories;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ro.esolutions.Application;
import ro.esolutions.entities.User;

import java.util.List;

/**
 * Created by Bogdan Stoean on 15.02.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserRepositoryCustomTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testCustomOperation() {
        String hql = "select u from User u where active=true";
        List<User> users = userRepository.customOperation(hql);
        Assert.assertEquals(users.size(), 10);
    }
}
