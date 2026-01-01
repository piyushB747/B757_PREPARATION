package net.kanth;

import java.util.List;

import net.kanth.dto.DtoEmployee;

public interface MotherInterface {

	public abstract void termianlStreamOperation();
	
	public abstract int smallestElememtIntegerList(List<Integer> lstObj);  //On Integers
	
	public abstract int largestElememtIntegerList(List<Integer> lstObj);   //On Integers
	
	public abstract DtoEmployee largestSalaryInTheList(List<DtoEmployee> lstObj);
	
}
