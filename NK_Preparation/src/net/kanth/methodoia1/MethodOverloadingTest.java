package net.kanth.methodoia1;

public class MethodOverloadingTest {

	private void nakul(String str,String vmr) {
		System.out.println("Vimbar");
	}
	
	private void nakul(String str,int vmr) {
		System.out.println("sf");
	}
	
	
	public static void main(String[] args) {
		new MethodOverloadingTest().nakul(null, 0);
	}
	
	
}
