package by.stormnet.volodko.InOutSystem;

public class DevOps extends Employee implements RoomVisiter {
	public DevOps(String name, String surname) {
		super(name, surname);
	}

	@Override
	public void exitroom() {
		System.out.println("Вход разрешен в комнату 123");
	}

	@Override
	public void press() {
		System.out.println("Нажать ручку");
	}
}
