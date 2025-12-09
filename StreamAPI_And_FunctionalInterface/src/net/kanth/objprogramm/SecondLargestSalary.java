package net.kanth.objprogramm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import net.kanth.MotherInterface;
import net.kanth.abstractmother.AbstractMother;
import net.kanth.model.ModelEmployee;

class SalaryDescComparator implements Comparator<ModelEmployee> {

	@Override
	public int compare(ModelEmployee o1, ModelEmployee o2) {
		return Double.compare(o2.getSalary(), o1.getSalary());
	}
	
}
public class SecondLargestSalary extends AbstractMother{

	@Override
	public ModelEmployee secondLargestSalaryNumberinModel(List<ModelEmployee> lstObj) {
	    
	    Comparator<ModelEmployee> comparator = new SalaryDescComparator();

	    ModelEmployee secondHighest = lstObj.stream()
	            .sorted(comparator)       // descending order
	            .map(ModelEmployee::getSalary)
	            .distinct()
	            .skip(0)
	            .findFirst()
	            .flatMap(sal -> lstObj.stream()
	                    .filter(e -> e.getSalary() == sal)
	                    .findFirst()
	            )
	            .orElse(null);

	    return secondHighest;
	}
	
	public static void main(String[] args) {
		List<ModelEmployee> lstEmp = Arrays.asList(
                new ModelEmployee(1, "Piyush", 80000),
                new ModelEmployee(2, "Ravi", 55000),
                new ModelEmployee(3, "Amit", 60000), // duplicate salary
                new ModelEmployee(4, "Sohan", 65000)
        );
		
		MotherInterface m1 =  new SecondLargestSalary();
		ModelEmployee emp = m1.secondLargestSalaryNumberinModel(lstEmp);
		System.out.println(emp);
	}

	
}
