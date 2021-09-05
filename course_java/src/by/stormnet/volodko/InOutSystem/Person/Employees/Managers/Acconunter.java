package by.stormnet.volodko.InOutSystem.Person.Employees.Managers;

import by.stormnet.volodko.InOutSystem.IdCard;
import by.stormnet.volodko.InOutSystem.OfficeStatus;
import by.stormnet.volodko.InOutSystem.RoomVisiter;

public class Acconunter extends Manager implements RoomVisiter {
	public Acconunter(String name, String surname, IdCard idCard, OfficeStatus officeStatus) {
		super(name, surname,idCard, officeStatus);
	}

	@Override
	public void exitroom() {
	}

	@Override
	public void presshandle() {
	}
}
