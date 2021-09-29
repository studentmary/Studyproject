package by.stormnet.volodko.InOutSystem.lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Price {
	public static void main(String[] args) {
		ArrayList<Phone> phones = new ArrayList<>();
		Collections.addAll(phones,
				new Phone("BB", 100),
				new Phone("CCC", 200),
				new Phone("A", 150));

		phones.stream()
				.sorted((p1, p2) -> {
					return p1.getName().length() - p2.getName().length();
				})
				.forEach(p -> System.out.println("Price " + "(" + p.getValue() + ")"));

	}
}