package com.springconcepts.ioc;

public class OnePlus implements Mobiles {
	
	Color color;
	
	OnePlus(){
		
	}

	OnePlus(Color getColor) {
		this.color = getColor;
	}

	@Override
	public void getModelAndColor() {
		System.out.println("OnePlus Model : 9 pro");
		color.getOnePlusColor();
	}

}
