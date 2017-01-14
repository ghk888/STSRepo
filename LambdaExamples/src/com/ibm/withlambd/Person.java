package com.ibm.withlambd;

public class Person {
	
	private String fistName;
	private String lastName;
	private int age;
	
	public Person(String firstName,String lastName , int age)
	{
		this.fistName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		return "Person :[First name = "+fistName+" ,Last Name = "+lastName+" ,Age = "+age+"]";
	}

}
