package Entities;

import java.sql.Date;

import Abstract.IEntity;

public class Customer implements IEntity {
	private int id;
	private String FirstName;
	private String LastName;
	public int DateOfBirrth;
	private String NationalityId;
	
	public Customer(String firstName, String lastName, int dateOfBirrth, String nationalityId) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.DateOfBirrth = dateOfBirrth;
		this.NationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFistName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getDateOfBirrth() {
		return DateOfBirrth;
	}

	public void setDateOfBirrth(int dateOfBirrth) {
		DateOfBirrth = dateOfBirrth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
}
