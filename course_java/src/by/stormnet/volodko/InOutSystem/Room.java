package by.stormnet.volodko.InOutSystem;

public class Room<Employee> {
	public Employee into;

	public void putEmployee(Room into) { //параметр метода типа Employee
		this.into = (Employee) into;

	}
}

