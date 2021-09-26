package by.stormnet.volodko.lesson5.task2;

import by.stormnet.volodko.lesson5.task2.Stul;

public class Main {
	public static void main(String[] args) {

		Stul Stul = new Stul("kitchen", "wood");
		Stul.Seat sidenie = Stul.new Seat();
		Stul.Legs nozhki = Stul.new Legs();
		Stul.Back spinka = Stul.new Back();

		sidenie.up();
		spinka.backward();
		nozhki.legs();
	}
}
