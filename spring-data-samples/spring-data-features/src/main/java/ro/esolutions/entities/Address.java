package ro.esolutions.entities;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by Bogdan Stoean on 02.03.2015.
 */
@Entity
public class Address extends AbstractPersistable<Long> {

	private String city, county, country;

	@ManyToOne
	private ZipCode zipCode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ZipCode getZipCode() {
		return zipCode;
	}

	public void setZipCode(ZipCode zipCode) {
		this.zipCode = zipCode;
	}
}
