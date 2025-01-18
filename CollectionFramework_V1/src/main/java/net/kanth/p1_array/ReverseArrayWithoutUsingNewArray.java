package net.kanth.p1_array;


import java.util.Arrays;

public class ReverseArrayWithoutUsingNewArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Before reversing Array:=> " + Arrays.toString(arr) + " \n");

		int temp;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		System.out.println(" After reversing Array:=> " + Arrays.toString(arr) + " \n");
	}

}


//Reference ==> Java Guide
//Link      ==> https://www.youtube.com/shorts/2UUKLvQGhjs
