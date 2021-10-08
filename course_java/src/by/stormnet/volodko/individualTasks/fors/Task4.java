package by.stormnet.volodko.individualTasks.fors;


import java.util.ArrayList;
import java.util.Collections;

public class Task4 {
	ArrayList<Integer> numbers = new ArrayList<>();

	{
		Collections.addAll(numbers,
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}

	public static void main(String[] args) {
		/*
			Выводить числа на экран, пока не встретится число 7
		  	Использовать цикл fori
https://javarush.ru/groups/posts/for-v-java
 		 */

		/*
			Выводить числа на экран, пока не встретится число 7
		  	Использовать цикл forEach
https://javarush.ru/groups/posts/for-v-java
 		 */
		ArrayList<Integer> numbers = new ArrayList<>();

		{
			Collections.addAll(numbers,
					1, 7, 3, 4, 5, 6, 7, 8, 9, 10);
		}
		for (int i = 0; i < numbers.size(); i++) {
			if (i!=7){
			System.out.println(numbers.get(i));}
			else break;

		}
		for (Integer num : numbers
		) {
			if (num != 7) {
				System.out.println(num);
			} else break;
		}

	}
}

