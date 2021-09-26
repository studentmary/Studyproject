package by.stormnet.volodko.InOutSystem.Person.Employees;


import by.stormnet.volodko.InOutSystem.IdCard;
import by.stormnet.volodko.InOutSystem.OfficeStatus;

public class Employee extends Person {
	protected IdCard idCard;
	protected OfficeStatus officeStatus;


	public Employee(String name, String surname) {
		super(name, surname);
		this.idCard = null;
		// FIXME: 9/14/2021 Обращение к элементам в энамках происходит по названию энама
		this.officeStatus = officeStatus.NOT_IN_THE_OFFICE;
	}


	public IdCard getIdCard() {
		return idCard;
	}

	public OfficeStatus getOfficeStatus() {
		return officeStatus;
	}

	@Override
	public void displayInfo() {
		System.out.println("Имя: " + super.getName() + " " + "Фамилия: " + super.getSurname() + " " + "Статус: " + getOfficeStatus() + " " + "Номер карты: " + getIdCard());

	}


}
