package fiftyprog.java;

public class fifty {

	public static void main(String[] args)
	{
	    int age = 15;
	    if (age < 18) 
		  {
	        throw new IllegalArgumentException("Age must be 18 or older");
		  }
		        System.out.println("Access granted");
     }
}
