package org.hackerrank;

import java.util.Scanner;

public class Day4 {

	int age;
	
	public Day4(int initialAge)
	{
		
		 if(initialAge < 0){ // initial age is invalid
	            System.out.println("Age is not valid, setting age to 0.");
	            this.age = 0;
	        }
	        else{ // set age to valid initial age
	            this.age = initialAge;
	        }
	    }
	
	public void ageGroup()
	{
		
	
		String result = "";
        if(age >= 18){
            result = "You are old.";
        }
        else if(age >=13){
            result = "You are a teenager.";
        }
        else{
            result = "You are young.";
        }
        System.out.println(result);
    
	}
	
	public void yearPasses() {
  		// Increment this person's age.
        this.age++;
    }
	public static void main(String[] args) 
	{
		System.out.println("Enter your age");
		Scanner scan= new Scanner(System.in);
		int age=scan.nextInt();
		Day4 four=new Day4(age);
		four.ageGroup();
		four.yearPasses();
	
	}
	
}
