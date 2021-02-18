package com.app;

public class FunInterfaceTest implements FunInterface {
	
	
	public static void one() {
		System.out.println("Hello...");
	}

	@Override
	public void methodOne() {
              System.out.println("abstract override method");

	}
	
	//can not override default or abstract method

	public static void main(String[] args) {

		FunInterface f=new FunInterfaceTest();
		f.methodFour();              //default
		f.methodOne();               //abstract override
		                             //can not call static method in main method
		
		
		FunInterfaceTest ft=new FunInterfaceTest();
		ft.one();
		one();          //can call without object
	}

}
