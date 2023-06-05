package com.Ronak;

public class RBI {
	public float getROI() {
		return 5.08f;
		}
	}

class SBI extends RBI{
	@Override 
	public float getROI()
	{
		return 7.09f;
	}
}