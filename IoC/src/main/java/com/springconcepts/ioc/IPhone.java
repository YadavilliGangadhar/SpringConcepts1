package com.springconcepts.ioc;

public class IPhone implements Mobiles {

	Color color;
	
	IPhone(){
		// default constructor
	}
	
	IPhone(Color getColor) {
		this.color = getColor;
	}
	
	@Override
	public void getModelAndColor() {
		System.out.println("IPhone Model : 13 pro max");
		color.getIPhoneColor();
	}

}
