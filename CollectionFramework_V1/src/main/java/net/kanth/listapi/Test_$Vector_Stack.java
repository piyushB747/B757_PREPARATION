package net.kanth.listapi;

import java.util.Iterator;
import java.util.Stack;

public class Test_$Vector_Stack {

	public static void main(String[] args) {

		Stack<Integer> stack_1 = new Stack<Integer>();
		stack_1.add(212123232);
		stack_1.add(1);

		stack_1.add(4);
		stack_1.add(55);
		stack_1.add(null);

		System.out.println(stack_1);

		stack_1.push(232);
		System.out.println(stack_1);

		stack_1.pop(); // 232 removed last element first FIFO principal
		stack_1.pop(); // null removed last element first FIFO principal

		stack_1.push(1);
		System.out.println(stack_1.peek() + " return top element from end"); // return top element from end

		Stack<String> strlist = new Stack<>();
		strlist.push("Laxmi"); // push is to add element
		strlist.push("Riya");
		strlist.push("Mandakani");
		strlist.push("Aradhana");

		System.out.println("\n" + strlist.peek() + " <=Top of the stack element \n\n" + strlist);

		/*
		 * while (!strlist.empty()) { System.out.println(strlist);
		 * System.out.println(strlist.pop()); // pop is to remove the element }
		 * 
		 * System.out.println(strlist+" I am the best");
		 */

		Iterator<String> str = strlist.iterator();
		while (str.hasNext()) {
			System.out.println("Iterating list " + str.next());
		}

	}

}
