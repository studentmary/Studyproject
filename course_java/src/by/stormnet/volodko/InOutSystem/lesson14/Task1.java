package by.stormnet.volodko.InOutSystem.lesson14;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<String> elements = new ArrayList<>();
		Collections.addAll(elements, "бериллий", "сера", "сурьма", "серебро", "селен");
		elements.stream()
				.filter(i -> !i.contains("сер"))
				.sorted((i1, i2) -> i1.length() - i2.length())
				.forEach(System.out::println);

	}


}
