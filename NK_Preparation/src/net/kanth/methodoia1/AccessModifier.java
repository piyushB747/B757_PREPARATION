package net.kanth.methodoia1;

class Luv_{
	
	protected void lovely() {
		System.out.println("I am main Loverly");
	}
	
	public void devamanus() {
		System.out.println("Boeing");
	}
	
	void rockstar() {
		System.out.println("I am rockstar");
	}
	
}
class Gautam_ extends Luv_{
	
	@Override
	public void rockstar() {
		System.out.println("I am rockstar");
	}
	
	@Override
	public void devamanus() {
		System.out.println("Mistry");
	}
	
	/*VALID OVERRIDDING*/
	@Override
	public void lovely(){                      
		System.out.print("I am the best");
	}
	
	/*  INVALID OVERRIDEN
	@Override
	private void lovely(){                    //Cannot reduce the visibility of the inherited method from Luv_  
		System.out.print("I am the best");
	}
	*/
}

public class AccessModifier {

	
	public static void main(String[] args) {
		Luv_ luv =  new Gautam_();
		luv.lovely();
		luv.rockstar();
	}
}
