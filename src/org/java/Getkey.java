package org.java;

import java.io.IOException;
import java.util.TreeMap;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;


public class Getkey {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
TreeMap<String , String>tr=new TreeMap<String, String>();
tr.put("India", "delhi");
tr.put("Karnataka", "Bangalore");
tr.put("Tamilnadu", "Chennai");
System.out.println(tr.containsKey("India"));
	}

}
