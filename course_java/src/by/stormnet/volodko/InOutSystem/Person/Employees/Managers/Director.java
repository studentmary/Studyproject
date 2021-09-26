package by.stormnet.volodko.InOutSystem.Person.Employees.Managers;

import by.stormnet.volodko.InOutSystem.OfficeStatus;
import by.stormnet.volodko.InOutSystem.IdCard;
import by.stormnet.volodko.InOutSystem.RoomVisiter;

public class Director extends Manager implements RoomVisiter {


	public Director(String name, String surname) {
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