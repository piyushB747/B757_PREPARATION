package net.kanth.functionapi;

import java.util.function.Function;

import net.kanth.model.StudentModel;

public class FunctionObjExample {

	public static void main(String[] args) {

		Function<StudentModel, String> xAI = x -> {
			return x.getName();
		};
		
		System.out.println(xAI.apply(new StudentModel(1,"Piyush","Munbai")));		
		
		Function<StudentModel, StudentModel> xAI2 = Function.identity();
		
		System.out.println(xAI2.apply(new StudentModel(1,"Piyush","Munbai")));
	}

}
