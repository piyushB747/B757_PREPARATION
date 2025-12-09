package net.kanth.objprogram_Lowest;

import java.util.Arrays;
import java.util.List;
import net.kanth.MotherInterface;
import net.kanth.abstractmother.AbstractMother;
import net.kanth.model.ModelEmployee;

public class SecondLowestSalaryExample extends AbstractMother{

	@Override
	public ModelEmployee secondLowestSalaryNumberinModel(List<ModelEmployee> lstObj) {
		
		//Comparator<ModelEmployee> xNx = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());

		ModelEmployee empObj = lstObj.stream()
		        .map(ModelEmployee::getSalary)
		        .distinct()                            // remove duplicate salaries
		        .sorted()                               // ascending
		        .skip(1)                                // skip lowest salary
		        .findFirst()
		        .flatMap(sal -> lstObj.stream()
		                .filter(e -> Double.compare(e.getSalary(), sal) == 0)
		                .findFirst()
		        )
		        .orElse(null);

		System.out.println("Second Lowest Salary: " + empObj);
		
		return null;
	}
	
	public static void main(String[] args) {
		List<ModelEmployee> lstEmp = Arrays.asList(
                new ModelEmployee(1, "Piyush", 80000),
                new ModelEmployee(2, "Ravi", 45000),
                new ModelEmployee(3, "Amit", 55000), // duplicate salary
                new ModelEmployee(4, "Arpit ", 65000), // duplicate salary
                new ModelEmployee(6, "Sohan", 65000)
        );
		
		MotherInterface m1 =  new SecondLowestSalaryExample();
		ModelEmployee emp = m1.secondLowestSalaryNumberinModel(lstEmp);
		System.out.println(emp);
	}
}
