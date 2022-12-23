package com.Ishait.UserRegistration.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Userregister {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="USER_FNAME")
	private String fname;
	
	@Column(name="USER_Lname")
	private String  lname;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Address")
	private String Address;
	
	@Column(name="AGE")
	private int age ;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Userregister [id=" + id + ", fname=" + fname + ", lname=" + lname + ", username=" + username
				+ ", password=" + password + ", Address=" + Address + ", age=" + age + "]";
	}

	
	
	
	
	

}
