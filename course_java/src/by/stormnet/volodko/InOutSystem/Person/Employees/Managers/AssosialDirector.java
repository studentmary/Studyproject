package by.stormnet.volodko.InOutSystem.Person.Employees.Managers;

import by.stormnet.volodko.InOutSystem.IdCard;
import by.stormnet.volodko.InOutSystem.OfficeStatus;
import by.stormnet.volodko.InOutSystem.RoomVisiter;

public  class AssosialDirector extends Manager  implements RoomVisiter {
	public AssosialDirector(String name, String surname, IdCard idCard, OfficeStatus officeStatus) {
		super(name, surname, idCard,officeStatus);
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

