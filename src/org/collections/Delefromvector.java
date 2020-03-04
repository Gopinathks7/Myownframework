package org.collections;

import java.util.Iterator;
import java.util.Vector;

public class Delefromvector {

	public static void main(String[] args) 
	{
		Vector<String>vct=new Vector<String>();
		vct.add("Gopinath");
		vct.add("Kumsi");
		vct.add("Shimoga");
	
		Vector<String>v=new Vector<String>();
		
		v.add("Shobha");
		v.add("bangalore");
		v.add("nanda");
		//vct.addAll(v);
	System.out.println(	vct.containsAll(v));
		//System.out.println(vct);
	}

}
