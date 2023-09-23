package org.axciom.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private String email;
	private String name;
	private String password;
	
	
	public User() {
		System.out.println("User.User()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPasssword(String passsword) {
		this.password = passsword;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", passsword=" + password + "]";
	}
}
