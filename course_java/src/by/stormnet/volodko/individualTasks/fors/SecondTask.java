package by.stormnet.volodko.individualTasks.fors;


import java.util.ArrayList;
import java.util.Collections;

public class SecondTask {
	ArrayList<String> text = new ArrayList<>();

	{
		Collections.addAll(text,
				"First sentence.",
				"Second sentece.",
				"Third sentece.",
				"Other sentece.",
				"Hello!");
	}

	public static void main(String[] args) {
		/*
			Вывести на экран все предложения из списка text на экран в ОБРАТНОМ порядке
		  	Использовать цикл fori
https://javarush.ru/groups/posts/for-v-java
 		 */
		ArrayList<String> text = new ArrayList<>();

		{
			Collections.addAll(text,
					"First sentence.",
					"Second sentece.",
					"Third sentece.",
					"Other sentece.",
					"Hello!");
		}

		for (int i = text.size() - 1; i >= 0; i--) {
			System.out.println(text.get(i));

		}

	}

}
