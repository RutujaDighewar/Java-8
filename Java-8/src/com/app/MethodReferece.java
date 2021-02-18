package com.app;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferece {

	public static void main(String[] args) {

		Function<String ,String> lambdaFunction = s->s.toUpperCase();
		System.out.println(lambdaFunction.apply("abc"));
		
		
		Function<String, String> referenceFunction= String::toUpperCase;
		System.out.println(referenceFunction.apply("abc"));
		
		Function<String, String> reference1Function=String::toLowerCase;
		System.out.println(reference1Function.apply("ABC"));
		
		
		String str="pqr";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		
		Function<String , Integer> reference2Function=Integer::parseInt;
		System.out.println(reference2Function.apply("101"));
		
		Employee e=new Employee();
		e.setName("Rutuja");
		
		Supplier<String> supplier=e::getName;
		System.out.println(supplier.get());
		
		
	}

}
