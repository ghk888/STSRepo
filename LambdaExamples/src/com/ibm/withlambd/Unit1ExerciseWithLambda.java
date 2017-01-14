package com.ibm.withlambd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseWithLambda {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
					new Person("Hari","Golla",34),
					new Person("Rukmini Krishna","Sola",5),
					new Person("Ravi","Golla",32),
					new Person("Krishna Veni","Sola",28)
					
				);
	
	
		Collections.sort(people ,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		printLastNameWithCondition(people,p->true);
		 
		 System.out.println("-------------");
		 
		 printLastNameWithCondition(people,p->p.getLastName().startsWith("S"));
		 
		 System.out.println("-------------");
		 
		 printLastNameWithCondition(people,p->p.getLastName().startsWith("G"));
		 
		 
		 
		 
		 
	}
	
	
	//Old Model of Creating interface called Condition and using it ..
/*	private static void printLastNameWithCondition(List<Person> people,Condition c) {
		for(Person p: people)
		{
			if(c.test(p))
			System.out.println(p);
		}
		
	}*/
	
	//new Method to use Predicate(Functional Interface)
	
	private static void printLastNameWithCondition(List<Person> people,Predicate<Person> predicate) {
		for(Person p: people)
		{
			if(predicate.test(p))
			System.out.println(p);
		}
		
	}
	
	/*private static void printAll(List<Person> people)
	{
		for(Person p: people)
		{
			System.out.println(p);
		}
	}*/
		
	
	private interface Condition
	{
		public boolean test(Person p);
		
	}

		
}
