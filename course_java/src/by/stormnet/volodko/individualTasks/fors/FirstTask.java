package by.stormnet.volodko.individualTasks.fors;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstTask {
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
			Вывести на экран все предложения из списка text на экран
		  	Использовать цикл forEach
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

			for (String sentence : text
			) {
				System.out.println(sentence);

			}
		}


	}
}
