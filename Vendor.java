package org.axciom.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendor {

	@Id
	private String email;
	private String name;
	private String password;
	private String category;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Vendor [email=" + email + ", name=" + name + ", password=" + password + ", category=" + category + "]";
	}

}
