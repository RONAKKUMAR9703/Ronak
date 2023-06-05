package com.Ronak;

public class Car {
	
	final int speedlimit =140;
	void run() {
		speedlimit=200;
	}

	public static void main(String[] args) {
		Car obj =new Car ();
		obj.run();

	}

}
