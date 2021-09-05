package by.stormnet.volodko.InOutSystem.Person.Employees.Managers;

import by.stormnet.volodko.InOutSystem.Person.Employees.Employee;
import by.stormnet.volodko.InOutSystem.OfficeStatus;
import by.stormnet.volodko.InOutSystem.IdCard;

public abstract class Manager extends Employee {
	public Manager(String name, String surname, IdCard idCard, OfficeStatus officeStatus) {
		super(name, surname, idCard, officeStatus);
	}

}
