package com.oop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext run =SpringApplication.run(Application.class, args);
		 //HIS-134
		 //left HIS-122 at middle and working on HIS-134
		int i =10;
		 run.close();
	}
	//His-200 related changes
	public void doProcess() {
	
		//logic goes here
		}

}
