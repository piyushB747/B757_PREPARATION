package net.kanth;

//What is Truncation In Java?

//=> When you convert bigData Type into Small DataType there is a chance of data Lost and it is done forcefully (EXPLICTLY).

/*** Java Program To Convert Double Number into Int Value Input = 8.5 ***/
public class ConvertDoubleIntoInteger {

	public static void main(String[] args) {

		double d = 546.3;

		@SuppressWarnings("removal")
		Double dblValue = new Double(d);

		int value = dblValue.intValue(); // 1 Way
		System.out.println(" " + value);

		int value2 = (int) Math.round(d); // 2 Way

		System.out.println(value2);

	}

}
