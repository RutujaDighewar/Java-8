/**
 * 
 */
package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Rutuja
 *
 */
public class LamdaExpression {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("w");
		list.add("A");
		list.add("H");
		list.add("N");
		list.add("Y");
		list.add("abc");

		list.forEach(System.out::println);

		
		list.forEach(s -> {
			if (s.contains("abc"))
				System.out.println(s);
		});
		
		
		Stream<String> stream=list.stream();
	    stream.forEach(System.out::println);
	//	System.out.println(stream.count());      //java.lang.IllegalStateException: stream has already been operated upon or closed
		
		
		for(String string : list) {System.out.println(string);}
		
		
		/*(Parameters) -> Expression
                                                  lamda expression syntax
		           OR

		(Parameters) -> { Statements }*/

	}

}
