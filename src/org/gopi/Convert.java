package org.gopi;

import java.io.IOException;
import java.util.HashMap;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;




public class Convert {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException
	{
	HashMap<String , String>name=new HashMap<String, String>();
	name.put("karnataka", "Bangalore");
	name.put("Tamilnadu", "Chennai");
	name.put("Telgu", "Vaizag");
	ObjectMapper object= new ObjectMapper();
	String json=object.writeValueAsString(name);
	System.out.println("JSOM formater:"+json);
	}

}
