package net.kanth;

import net.kanth.model.ModelEmployee;
import java.util.List;
public interface MotherInterface {
	
	public abstract int smallestElememtInTheList(List<Integer> lstObj);
	
	public abstract int largestElementInTheList(List<Integer> lstObj);
	
	public abstract ModelEmployee secondLargestSalaryNumberinModel(List<ModelEmployee> lstObj);
	
	public abstract ModelEmployee secondLowestSalaryNumberinModel(List<ModelEmployee> lstObj);
}
