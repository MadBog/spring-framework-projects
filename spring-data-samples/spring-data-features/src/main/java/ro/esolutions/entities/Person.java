package ro.esolutions.entities;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by Bogdan Stoean on 25.02.2015.
 */
@Entity
public class Person extends AbstractPersistable<Long> {

	@ManyToOne
	private User user;

	@ManyToOne
	private Address address;

	private String addressZip;


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getAddressZip() {
		return addressZip;
	}

	public void setAddressZip(String addressZip) {
		this.addressZip = addressZip;
	}
}
