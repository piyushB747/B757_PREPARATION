package net.kanth.objlst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class DtoStudent implements Comparable<DtoStudent>{
	
	public int id;
	public String name;
	
	@Override
	public int compareTo(DtoStudent o) {
		return Integer.compare(this.id, o.id);
	}

	public DtoStudent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "DtoStudent [id=" + id + ", name=" + name + "]";
	}
}

public class ObjectCompare2 {

	public static void main(String[] args) {
		
		
		DtoStudent dto2 = new DtoStudent(1,"Piyushraj");
		DtoStudent dto = new DtoStudent(2,"Amit");
		DtoStudent dto3 = new DtoStudent(5,"Pravin");
		DtoStudent dto4 = new DtoStudent(11,"Piyushraj");
		DtoStudent dto5 = new DtoStudent(12,"Nikhil");
		DtoStudent dto6 = new DtoStudent(22,"Pravin");
	
		List<DtoStudent> lstObj = new ArrayList<>(Arrays.asList(dto,dto4,dto3,dto2,dto5,dto6));
		Collections.sort(lstObj);
		
		lstObj.forEach(System.out::println);
		
	}
}
