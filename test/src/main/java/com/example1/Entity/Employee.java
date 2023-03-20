package com.example1.Entity;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Table;
//import jakarta.persistence.Id;

@javax.persistence.Entity
@javax.persistence.Table(name="emp")
public class Employee {


    @javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
   @javax.persistence.Column(name="Id")
	private long Id;
   @javax.persistence.Column(name="Name")
	private String Name;
   @javax.persistence.Column(name="email")
	private String email;
public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
