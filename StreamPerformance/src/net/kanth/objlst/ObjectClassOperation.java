package net.kanth.objlst;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import net.kanth.AbstractMother;
import net.kanth.dto.DtoEmployee;

class SalaryComparatorDesc implements Comparator<DtoEmployee>{
	@Override
	public int compare(DtoEmployee o1, DtoEmployee o2) {
		return Double.compare(o1.getSalary(), o2.getSalary());
	}
}

public class ObjectClassOperation extends AbstractMother {

	@Override
	public DtoEmployee largestSalaryInTheList(List<DtoEmployee> lstObj) {
	    Comparator<DtoEmployee> comparator = new SalaryComparatorDesc();

		return lstObj.stream()
				.sorted(comparator)
				.map(p -> p.getSalary())
				.distinct()
				.skip(0)
				.findFirst()
				.flatMap(p->  lstObj.stream()
						.filter(e -> e.getSalary() == p)
						.findFirst()
						)
				.orElse(null);
	}
	
	
	public static void main(String[] args) {
		AbstractMother obj = new ObjectClassOperation();
		
		List<DtoEmployee> lstEmp = Arrays.asList(
                new DtoEmployee(1, "Arbaz", 80000),
                new DtoEmployee(2, "Ravi", 55000),
                new DtoEmployee(3, "Amit", 60000), // duplicate salary
                new DtoEmployee(4, "Sohan", 65000)
        );
		
		System.out.println("Largest Salary in the group is: "+obj.largestSalaryInTheList(lstEmp));
	}
	
}
