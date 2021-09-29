package by.stormnet.volodko.InOutSystem.lesson14;

import java.util.ArrayList;
import java.util.Collections;


public class Task2 {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		Collections.addAll(words, "gas", "voron", "rain", "devor");
		String word = words.stream()
				.filter(i -> i.contains("vor"))
				.findFirst().orElse("No elements");
		System.out.println(word);
	}

}
