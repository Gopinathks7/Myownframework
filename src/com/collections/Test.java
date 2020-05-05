package com.collections;

public class Test {

static int x=10;
	public static void main(String[] args) {
int x[]= {1,2,3,4};
int y[]=x;;
x=new int[2];
for(int i=0;i<x.length;i++)
{
	System.out.println(y[i]+"  ");
}
	}
}