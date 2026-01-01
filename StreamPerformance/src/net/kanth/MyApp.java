package net.kanth;

import java.text.Collator;

public class MyApp extends AbstractMother {

	public static void main(String[] args) {
		AbstractMother mother = new MyApp();
		mother.termianlStreamOperation();
		
		StringComparision();
		stringCompare();
	}

	public static void StringComparision() {

		String str1 = "apple";
		String str2 = "banana";

		int x = str2.compareTo(str1);
		System.out.println("\nCompare Result=>  " +x);

	}
	
	
	public static void stringCompare() {
		String str1 = "apple";
		String str2 = "banana";

		
		Collator collator = Collator.getInstance();
	
		System.out.println("===>"+collator.compare(str1, str2));
	}
	
}
