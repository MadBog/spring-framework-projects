package ro.esolutions.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Bogdan Stoean on 25.02.2015.
 */
@Entity
public class User extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true)
	private String username;

	private String role, email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
