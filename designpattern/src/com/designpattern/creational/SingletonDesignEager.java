package com.designpattern.creational;

public class SingletonDesignEager {
	
	private static SingletonDesignEager singletonDesignLazy = new SingletonDesignEager();
	
	public static SingletonDesignEager getInstance() {		
		return singletonDesignLazy;
	}

}
