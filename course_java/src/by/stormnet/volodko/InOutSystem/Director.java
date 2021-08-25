package by.stormnet.volodko.InOutSystem;

public class Director extends Manager implements RoomVisiter {


	public Director(String name, String surname) {
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

