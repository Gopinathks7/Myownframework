package org.java;

import java.io.IOException;

public class EXC13 {

	public static void main(String[] args) throws IOException {

int f=0;
int sum=1;
int num=0;
System.out.print(f+"  ");
System.out.print(sum+"  ");

for(int i=1;i<=5;i++)
{
	num=f+sum;
	System.out.print(num+"  ");
	f=sum;
	sum=num;
}

	}

}
