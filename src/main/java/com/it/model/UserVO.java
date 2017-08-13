package com.it.model;

import java.io.Serializable;


public class UserVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String name;

	private String password;

	private String age;

	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserVO{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", age='" + age + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
