package com.springconcepts.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileConfig {
	
	@Bean
	public Color getColor() {
		return new Color();
	}
	
	@Bean
	public Mobiles getOnePlusObject(Color getColor) {
		return new OnePlus(getColor);
	}
	
	@Bean
	public Mobiles getIPhoneObject(Color getColor) {
		return new IPhone(getColor);
	}
}
