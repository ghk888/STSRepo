package com.ibm.lambda.test;

import com.ibm.beforelambda.Greeting;
import com.ibm.beforelambda.HelloWorldGreeting;

public class Greeter {

	public void greet(Greeting greet)
	{
	System.out.println(greet.perform());
		
	}
	
	public static void main(String[] args) {
		
		Greeter greeter  = new Greeter();
		greeter.greet(new HelloWorldGreeting());
	}

}
