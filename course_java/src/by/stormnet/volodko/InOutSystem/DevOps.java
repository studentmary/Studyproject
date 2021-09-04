package by.stormnet.volodko.InOutSystem;

public class DevOps extends Employee implements RoomVisiter {
	public DevOps(String name, String surname, IdCard idCard, OfficeStatus officeStatus){
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
