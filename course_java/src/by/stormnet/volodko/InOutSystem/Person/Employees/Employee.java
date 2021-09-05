package by.stormnet.volodko.InOutSystem.Person.Employees;


import by.stormnet.volodko.InOutSystem.IdCard;
import by.stormnet.volodko.InOutSystem.OfficeStatus;

public class Employee extends Person {
	 protected IdCard idCard;
	protected OfficeStatus officeStatus;


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
