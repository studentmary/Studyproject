package by.stormnet.volodko.InOutSystem;

class Employee extends Person {
	protected long id;
	protected static long counter = 0000000000;


	public Employee(String name, String surname) {
		super(name, surname);
		id = counter++;
	}


	@Override
	public void displayInfo() {
		System.out.println("Имя: " + super.getName() + " " + "Фамилия: " + super.getSurname() + " " + "Номер карты: " + id);
	}

}
