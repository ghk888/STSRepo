package com.ibm.beforelambda;

public class HelloWorldGreeting implements Greeting{

	@Override
	public String perform() {
		return "Hello World";
	}

}
