package by.stormnet.volodko.InOutSystem;

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
