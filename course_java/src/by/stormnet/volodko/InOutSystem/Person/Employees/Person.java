package by.stormnet.volodko.InOutSystem.Person.Employees;

public abstract class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}


	public String getSurname() {
		return surname;
	}


	public abstract void displayInfo();

}

