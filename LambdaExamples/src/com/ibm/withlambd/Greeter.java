package com.ibm.withlambd;

import com.ibm.beforelambda.Greeting;
import com.ibm.lambda.functionalinterfaces.UserEntity;

public class Greeter {

	public static void main(String[] args) {
		
		Greeting greeter = ()->  "Hello World Hari";
		
		System.out.println(greeter.perform());
		
		User u = new User();
		u.setId(10);
		
		
		UserEntity entity = (user) -> 
		{
			user.getId();
			return user;
			
		};
		
		System.out.println(entity.doubleUserId(u).getId());
		
	}
	
}
