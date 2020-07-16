package com.learn;

public class PRG4 implements Comparable
{
int number ;
String name;
double marks;
public PRG4(int number ,String name,double marks)
{
	this.number=number;
	this.name=name;
	this.marks=marks;
}


public int compareTo(Object o) {
	PRG4 p=(PRG4)o;
	int value=this.number-p.number;
	return value;
}

	public String toString()
	{
		String display=number+" " +name+"  " +marks+"  ";
		return display;
	}
	}

	


