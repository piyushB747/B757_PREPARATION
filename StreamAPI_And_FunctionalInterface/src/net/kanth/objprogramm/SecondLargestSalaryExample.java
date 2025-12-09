package net.kanth.objprogramm;

import net.kanth.MotherInterface;
import net.kanth.abstractmother.AbstractMother;
import net.kanth.model.ModelEmployee;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
public class SecondLargestSalaryExample extends AbstractMother{
	
	@Override
	public ModelEmployee secondLargestSalaryNumberinModel(List<ModelEmployee> lstObj) {
		
		   ModelEmployee e1 =  lstObj
				   .stream()
				   .sorted(Comparator.comparingDouble(ModelEmployee::getSalary).reversed())
				   .map(emp -> emp)
				   .distinct()
				   .skip(2)
				   .findFirst()
				   .orElse(null);
		   
		   System.out.println(e1.toString());
		   
		   ModelEmployee e2 = lstObj.stream()
			        .map(ModelEmployee::getSalary)
			        .distinct()
			        .sorted(Comparator.reverseOrder())
			        .skip(1)
			        .findFirst()
			        .flatMap(sal -> lstObj.stream()
			                .filter(e -> e.getSalary() == sal)
			                .findFirst()
			        )
			        .orElse(null);
		   
		   System.out.println(e2);

		return e2;
	}
	
	

	public static void main(String[] args) {
		
		List<ModelEmployee> lstEmp = Arrays.asList(
	                new ModelEmployee(1, "Piyush", 80000),
	                new ModelEmployee(2, "Ravi", 55000),
	                new ModelEmployee(3, "Amit", 60000), // duplicate salary
	                new ModelEmployee(4, "Sohan", 65000)
	        );
		
		MotherInterface m1 =  new SecondLargestSalaryExample();
		m1.secondLargestSalaryNumberinModel(lstEmp);
	}
	
}
