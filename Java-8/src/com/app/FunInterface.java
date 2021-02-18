package com.app;

@FunctionalInterface
public interface FunInterface {

	public void methodOne();
	/*public void methodTwo();                   only one abstract method
	public void methodThree();*/
	
	
	default void methodFour() {
		System.out.println("Method one");
	}
	
	static void methodFive() {
		System.out.println("Method five");
	}
}
