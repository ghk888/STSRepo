package com.ibm.withlambd;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseWithoutLambdaEnhanced {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
					new Person("Hari","Golla",34),
					new Person("Rukmini Krishna","Sola",5),
					new Person("Ravi","Golla",32),
					new Person("Krishna Veni","Sola",28)
					
				);
	
		
	  Collections.sort(people,new Comparator<Person>() {
		  
		  @Override
		  public int compare( Person o1,Person o2)
		  {
			  return o1.getLastName().compareTo(o2.getLastName());
		  }
		  
		  
	  } );
	  
	  printAll(people);
	  
	  System.out.println("----------------");
	  
	  printLastNameWithCondition(people,new Condition()
	  {
		  @Override
		 public  boolean test(Person p)
		  {
			 return p.getLastName().startsWith("S");
		  }
		  
	  });
	  
	  System.out.println("----------------");
	  
	  printLastNameWithCondition(people,new Condition()
	  {
		  @Override
		 public  boolean test(Person p)
		  {
			 return p.getLastName().startsWith("G");
		  }
		  
	  });
	  
	
	}
	
	
	private static void printLastNameWithCondition(List<Person> people,Condition c) {
		for(Person p: people)
		{
			if(c.test(p))
			System.out.println(p);
		}
		
	}


	private static void printAll(List<Person> people)
	{
		for(Person p: people)
		{
			System.out.println(p);
		}
	}
	
	private interface Condition
	{
		public boolean test(Person p);
		
	}

}
