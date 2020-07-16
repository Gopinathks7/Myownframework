package com.learn;

import java.util.Iterator;
import java.util.TreeSet;

public class PRG5 
{ 
	
	public static void main(String [] a)
	{
TreeSet<PRG4> ts= new TreeSet<PRG4>();
PRG4 p1=new PRG4(1,"Kumsi",35);
PRG4 p2=new PRG4(6,"Gopinath",85);
PRG4 p3=new PRG4(3,"Shobha",65);
PRG4 p4=new PRG4(2,"nanda",35);
ts.add(p1);
ts.add(p2);
ts.add(p3);
ts.add(p4);
Iterator<PRG4>itr=ts.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
}
}