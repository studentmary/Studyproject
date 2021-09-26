package by.stormnet.volodko.InOutSystem.Person.Employees;

import by.stormnet.volodko.InOutSystem.OfficeStatus;
import by.stormnet.volodko.InOutSystem.IdCard;
import by.stormnet.volodko.InOutSystem.RoomVisiter;

public class DevOps extends Employee implements RoomVisiter {
	public DevOps(String name, String surname) {
		super(name, surname);
	}

	@Override
	public void exitroom() {
		System.out.println("Вход разрешен в комнату 123");
	}

	@Override
	public void presshandle() {
		System.out.println("Нажать ручку");
	}
}
