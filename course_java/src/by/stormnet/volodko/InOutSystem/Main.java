package by.stormnet.volodko.InOutSystem;

import by.stormnet.volodko.InOutSystem.Person.Employees.Employee;
import by.stormnet.volodko.InOutSystem.Person.Employees.IT;

import java.util.UUID;

public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Igor", "Gordon");
		Employee employee2 = new IT("Ivan", "Voronov");
		employee2.displayInfo();
	}
}
