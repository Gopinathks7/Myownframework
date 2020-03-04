package org.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Fir
{
	public static void fizzBuzz(int number)
	{
	for(int i=0;i<=number;i++)
	{
		System.out.println(i);
	if(i%3==0)
	{
		System.out.println("Fizz"+number);
	}
	else if (i%5==0)
	{
		System.out.println("Buzz"+number);
	}
	
}
}
}
public class FistTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine().trim());

Fir.fizzBuzz(15);
//
        bufferedReader.close();

	}

}
