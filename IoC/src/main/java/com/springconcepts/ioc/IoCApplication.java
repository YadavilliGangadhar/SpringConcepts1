package com.springconcepts.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class IoCApplication {

	public static void main(String[] args) {
		
//		Initialize spring bean container using AnnotationConfigApplicationContext() class.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobileConfig.class);
		
		Mobiles oneplus = context.getBean("getOnePlusObject",Mobiles.class);
		oneplus.getModelAndColor();
		
		Mobiles iphone = context.getBean("getIPhoneObject",Mobiles.class);
		iphone.getModelAndColor();
	}

}
