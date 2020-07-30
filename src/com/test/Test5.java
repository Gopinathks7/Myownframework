package com.test;

import java.util.Arrays;

//Spliting aa Array
public class Test5 {

	public static void main(String[] args) 
	{
		int[]numbers=new int[]{4,5,1,8,7,3};
		int a[]=Arrays.copyOfRange(numbers, 0, 2);
		System.out.println(Arrays.toString(a));
	}

}
