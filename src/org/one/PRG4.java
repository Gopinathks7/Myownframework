package org.one;

import java.util.Arrays;

public class PRG4 {

	public static void main(String[] args) 
	{
	
		int a[]= {1,2,3,4};
		a[2]=0;
		for(int i=0;i<a.length;i++) {
			int index=i;
			System.out.println("Element index is->" +index+ " The value is "+a[i]+" ");
		}

	}

}
