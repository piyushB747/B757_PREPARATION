package net.kanth.p1_array;

import java.util.Arrays;

public class ArrayP1 {
	
	public static void main(String[] args) {
		

		int[] arr = new int[2];   /***Initialization And Declaration*/
		arr[0] =1;
		arr[1] =2;
		
		for(int a:arr) {
			System.out.println("Elements Of Array => "+a);
		}
				
		
		/**SECOND WAY**/
		int arr2[] =  {1,2,3,4,5,6}; 
		for(int i=0;i<arr2.length;i++){
			System.out.println("Elements Of Array 2 => "+arr2[i]);
		}
		
		System.out.println("\n "+Arrays.toString(arr2));
		
	}

}