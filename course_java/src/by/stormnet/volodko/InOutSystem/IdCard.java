package by.stormnet.volodko.InOutSystem;

import by.stormnet.volodko.InOutSystem.Person.Employees.Employee;

import java.util.Random;
import java.util.UUID;

public class IdCard {

	String id =UUID.randomUUID().toString().substring(0,10).replaceAll("(\\D|-)+","");

}






