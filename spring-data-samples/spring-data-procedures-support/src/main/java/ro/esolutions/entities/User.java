package ro.esolutions.entities;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

/**
 * Created by Bogdan Stoean on 19.02.2015.
 */
@Entity
@NamedStoredProcedureQuery(name = "User.my_procedure", procedureName = "my_database_procedure", parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "arg", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "res", type = Integer.class) })
public class User extends AbstractPersistable<Long> {

	@Column(nullable = false, unique = true)
	private String username;

	private String password, firstName, lastName, role;

	private boolean active;


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
