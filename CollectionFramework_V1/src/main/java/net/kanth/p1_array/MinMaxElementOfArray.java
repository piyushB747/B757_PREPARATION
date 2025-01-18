package net.kanth.p1_array;

public class MinMaxElementOfArray {

	private int minElement(int[] arr) {
	   int min = 0;
	   
		for(int i=0;i<arr.length;i++) {
		   if(i!=0) {
			   if(arr[i]<min) {
				   min = arr[i];
			   }
		   }else {  min = arr[i]; }
	   }
		return min;
	}

	private int maxElement(int[] arr) {
		int max =0;
		for(int i=0;i<arr.length;i++) {
			   if(i!=0) {
				   if(arr[i]>max) {
					   max = arr[i];
				   }
			   }else {  max = arr[i]; }
		   }
		
		return max;
	}

	public static void main(String args[]) {
		
		
		int arr[] = {1111,2,3,4,5,66,5,98};
		
		MinMaxElementOfArray m1 =new MinMaxElementOfArray(); 
		
		System.out.println("Minimum element of array is "+m1.minElement(arr));
		System.out.println("Maximum element of array is "+m1.maxElement(arr));
		
	}
	
}
