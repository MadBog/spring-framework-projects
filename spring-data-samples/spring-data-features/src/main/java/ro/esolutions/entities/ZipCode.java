package ro.esolutions.entities;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

/**
 * Created by Bogdan Stoean on 02.03.2015.
 */
@Entity
public class ZipCode extends AbstractPersistable<Long> {

	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
