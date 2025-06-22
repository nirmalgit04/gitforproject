package com.designpattern;

import com.designpattern.creational.SingletonDesign;

public class Main {
	//private static final String Singleton s1  = null;

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//SingletonDesign s1 =new SingletonDesign();
		
		Class cls = Class.forName("com.designpattern.creational.SingletonDesign"); 
		  
        // Creating object of main class 
        // using instance method 
		SingletonDesign obj = (SingletonDesign)cls.newInstance();
		System.out.println(obj.hashCode());;
	}
}
