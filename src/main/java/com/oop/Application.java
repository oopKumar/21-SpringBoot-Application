package com.oop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

private  Map <String,Object> cache = new HashMap<String,Object>();
private static final String REST_URL="https://www.equifacks.com/getScores";



	public static void main(String[] args) {
		 ConfigurableApplicationContext run =SpringApplication.run(Application.class, args);
		 //HIS-134
		 //left HIS-122 at middle and working on HIS-134
		 run.close();
int  a=10;
	}
		//HIS-301 changes
	public  void loadDataToCache() {
		//Logic

		}


}
