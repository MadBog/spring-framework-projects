package ro.esolutions.repositories;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ro.esolutions.Application;
import ro.esolutions.entities.Person;
import ro.esolutions.entities.ZipCode;

import java.util.List;

/**
 * Created by Bogdan Stoean on 25.02.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class PersonRepositoryTest {

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private ZipCodeRepository zipCodeRepository;

	@Test
	public void testFindByUserActive(){
		List<Person> persons = personRepository.findByUserActive(false);
		System.out.println(persons.size());
		Assert.assertEquals(1,persons.size());
	}

	@Test
	public void testFindByAddress_ZipCode(){
		ZipCode zipCode = zipCodeRepository.findByCode("zip_1");
		Assert.assertNotNull(zipCode);
		List<Person> persons = personRepository.findByAddress_ZipCode(zipCode);
		Assert.assertEquals(2, persons.size());
	}
}
