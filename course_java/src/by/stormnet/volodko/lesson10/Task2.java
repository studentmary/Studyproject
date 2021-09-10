package by.stormnet.volodko.lesson10;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Task2 {
	public static void main(String[] args) {
		String s = "Тяжело в учении. Легко в бою.";
		// Pattern pattern1 = Pattern.compile("\\.");
		//Pattern pattern2 = Pattern.compile("\\w*+(\\s|,|!|\\.)");
		//System.out.println(Arrays.toString(split(s)));
		//System.out.println(Arrays.toString(split(s)));

		String[] sentence = s.split("\\.");
		for (String s2 : sentence) {
			System.out.println(s2);
		}
		String[] words = s.split(" ");
		for (String s1 : words) {
			System.out.println(s1);
		}

		String text; // правильно ли я поняла задание?
		text = String.join(",", "голубое небо", "желтое солнце", "зеленая трава", "синее море");
		System.out.println(text);
	}

}

