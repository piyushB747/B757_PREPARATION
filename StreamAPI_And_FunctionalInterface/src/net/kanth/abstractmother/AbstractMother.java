package net.kanth.abstractmother;

import net.kanth.MotherInterface;
import net.kanth.model.ModelEmployee;
import java.util.List;

public abstract class AbstractMother implements MotherInterface {
	
	@Override
	public int smallestElememtInTheList(List<Integer> lstObj) {
		return 0;
	}

	@Override
	public int largestElementInTheList(List<Integer> lstObj) {
		return 0;
	}

	@Override
	public ModelEmployee secondLargestSalaryNumberinModel(List<ModelEmployee> lstObj) {
		return null;
	}
	
	@Override
	public ModelEmployee secondLowestSalaryNumberinModel(List<ModelEmployee> lstObj) {
		return null;
	}
}
