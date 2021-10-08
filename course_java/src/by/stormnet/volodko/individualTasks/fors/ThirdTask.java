package by.stormnet.volodko.individualTasks.fors;


import java.util.ArrayList;
import java.util.Collections;

public class ThirdTask {
	ArrayList<Integer> numbers = new ArrayList<>();

	{
		Collections.addAll(numbers,
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}

	public static void main(String[] args) {
		/*
			Вывести на экран каждое второй число
		  	Использовать цикл fori
https://javarush.ru/groups/posts/for-v-java
 		 */
				/*
			Вывести на экран каждое второй число
		  	Использовать цикл forEach
https://javarush.ru/groups/posts/for-v-java
 		 */


		ArrayList<Integer> numbers = new ArrayList<>();

		{
			Collections.addAll(numbers,
					1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		}
		for (int i = 1; i < 10; i = i + 2) {
			System.out.println(numbers.get(i));
		}
		for (Integer allnumbers : numbers) {

				System.out.println(allnumbers);
		}

	}

}

