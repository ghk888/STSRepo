package com.ibm.lambda.functionalinterfaces;

import com.ibm.withlambd.User;

@FunctionalInterface
public interface UserEntity {
	
	public abstract User doubleUserId(User u);

}
