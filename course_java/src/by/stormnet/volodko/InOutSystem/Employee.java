package by.stormnet.volodko.InOutSystem;

import java.util.Arrays;
import java.util.Random;

class Employee extends Person {
	private final  IdCard idCard;
	private final OfficeStatus officeStatus;


	public Employee(String name, String surname, IdCard idCard, OfficeStatus officeStatus) {
		super(name, surname);
		this.idCard = idCard;
		this.officeStatus = officeStatus;
	}


	public IdCard getIdCard() {
		return idCard;
	}

	public OfficeStatus getOfficeStatus() {
		return officeStatus;
	}

	@Override
	public void displayInfo() {
		System.out.println("Имя: " + super.getName() + " " + "Фамилия: " + super.getSurname() + " " + "Статус: " + getOfficeStatus() + "Номер карты: " + getIdCard());

	}

}
