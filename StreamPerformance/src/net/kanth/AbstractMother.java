package net.kanth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import net.kanth.dto.DtoEmployee;

public abstract class AbstractMother implements MotherInterface {

	@Override
	public DtoEmployee largestSalaryInTheList(List<DtoEmployee> lstObj) {
		return null;
	}
	
	@Override
	public void termianlStreamOperation() {

		List<String> lstString = new ArrayList<>(Arrays.asList("Piyush", "Pravin", "Dilip", "Kushal", "Hrishikesh",
				"Sachin", "Brijesh", "Nikhil", "Ajay", "Shivam", "Shankar"));
		
		String reduce = lstString.stream()
                .reduce("", (x, y) -> x + " " + y);
		
		System.out.println(reduce);


		
		Optional<String> strFirst =  lstString.stream().findFirst();
		System.out.println(strFirst.isPresent()?strFirst.get():"Nothing is there brother");

		boolean strSecond = lstString.stream().anyMatch(x -> x.startsWith("Di"));
		System.out.println(strSecond);
	
		
		lstString.forEach(System.out::println);
		
		
		System.out.println(lstString.stream().count());
		

	}
	
	@Override
	public int smallestElememtIntegerList(List<Integer> lstObj) {
		return 0;
	};  
	
	@Override
	public int largestElememtIntegerList(List<Integer> lstObj) {
		return 0;
	}
	
	

	
	
}
