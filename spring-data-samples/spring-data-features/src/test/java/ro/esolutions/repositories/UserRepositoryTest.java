package ro.esolutions.repositories;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ro.esolutions.Application;
import ro.esolutions.entities.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by BOGDAN on 2/8/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testGetByUsername() {
        User user = userRepository.getByUsername("USER_1");
        System.out.println(user.getFirstName());
        Assert.assertNotNull(user);
    }

    @Test
    public void testFindByUsernameOptional() {
        Optional<User> user = userRepository.findByUsername("USER");
        Assert.assertEquals(user.isPresent(), false);
    }

    @Test
    public void testFindByFirstName() {
        List<User> users = userRepository.findByFirstName("FIRST_NAME_1");
        Assert.assertEquals(users.size(), 2);
    }

    @Test
    public void testFindByLastName() {
        Page<User> users = userRepository.findByLastName("LAST_NAME_1", new PageRequest(0, 5));
        Assert.assertEquals(2, users.getTotalElements());
    }

    @Test
    public void testFindByRoleOrderByUsernameAsc() {
        Slice<User> users = userRepository.findByRoleOrderByUsernameAsc("ROLE_1", new PageRequest(1, 2));
        Assert.assertEquals(users.hasNext(), true);
    }

    @Test
    public void testFindFirst5ByUsernameStartingWithOrderByEmailDesc() {
        List<User> users = userRepository.findFirst5ByUsernameStartingWithOrderByEmailDesc("USER");
        Assert.assertEquals(5, users.size());
    }

    @Test
    public void testFindTop5By() {
        List<User> users = userRepository.findTop5By();
        System.out.println(users.get(0).getUsername());
        Assert.assertEquals(5, users.size());
    }

}
