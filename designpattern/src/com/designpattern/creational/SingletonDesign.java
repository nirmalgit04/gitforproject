package com.designpattern.creational;

public class SingletonDesign extends Thread {

	private static SingletonDesign singletonDesign;

	private SingletonDesign() {

	}

	public void run() {
		getInstance();
	}

	public static SingletonDesign getInstance() {

		if (singletonDesign == null) {
			synchronized (singletonDesign) {
				if (singletonDesign == null) {
					singletonDesign = new SingletonDesign();
				}
			}
		}
		return singletonDesign;
	}

	public static void main(String[] args) {
		SingletonDesign d = new SingletonDesign();
		d.start();
		SingletonDesign d1 = new SingletonDesign();
		d1.start();
		System.out.println(d.hashCode());
		System.out.println(d1.hashCode());

	}

}
