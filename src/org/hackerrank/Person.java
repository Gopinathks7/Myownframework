package org.hackerrank;

 class Person
{

	int id;
	String FirstName;
	String LastName;
	public Person(int id,String FirstName,String LastName)
	{
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.id=id;
	}
}
 class Student extends Person
 {

	public Student(int id, String FirstName, String LastName) {
		super(id, FirstName, LastName);
		// TODO Auto-generated constructor stub
	}
	 
 }
