package by.stormnet.volodko.lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
	public static void main(String[] args) {
			Pattern pattern1 = Pattern.compile("\\d{3}\\W\\d{2}\\W\\d{2}");
			System.out.println(Pattern.matches(String.valueOf(pattern1), "123-45-67"));

		String s;
		s="8\\s[(]\\d{3}[)]\\s\\d{3}\\W\\d{2}\\W\\d{2}";
		System.out.println(Pattern.matches(s, "8 (029) 123-45-67"));

		String n;
		n= "[+]+[3]+[7]+[5]\\s[(]\\d{2}[)]\\s\\d{3}\\W\\d{2}\\W\\d{2} ";
		System.out.println(Pattern.matches(n,"+375 (29) 123-45-67"));


	}
}
