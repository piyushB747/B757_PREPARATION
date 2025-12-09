package net.kanth.objprogramm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import net.kanth.MotherInterface;
import net.kanth.abstractmother.AbstractMother;
import net.kanth.model.ModelEmployee;

public class SecondLargestSalaryExm2 extends AbstractMother{
	
	@Override
	public ModelEmployee secondLargestSalaryNumberinModel(List<ModelEmployee> lstObj) {
		
		Comparator<ModelEmployee> compare = (e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary());
		
		ModelEmployee xN =  lstObj
				.stream()
				.distinct()
				.sorted(compare)
				.map(x -> x.getSalary())
				.skip(1)
				.findFirst()
				.flatMap(xX -> lstObj.stream()
						.filter(x -> x.getSalary() == xX)
						.findFirst()
						)
				.orElse(null);
		
		return xN;
		
	}
	
	public static void main(String[] args) {
		List<ModelEmployee> lstEmp = Arrays.asList(
                new ModelEmployee(1, "Arbaz", 80000),
                new ModelEmployee(2, "Ravi", 55000),
                new ModelEmployee(3, "Amit", 60000), // duplicate salary
                new ModelEmployee(4, "Sohan", 65000)
        );
		
		MotherInterface m1 =  new SecondLargestSalary();
		ModelEmployee emp = m1.secondLargestSalaryNumberinModel(lstEmp);
		System.out.println(emp);
	}
	
}
