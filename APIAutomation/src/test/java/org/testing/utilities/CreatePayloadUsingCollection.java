package org.testing.utilities;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class CreatePayloadUsingCollection {

	public static void main(String[] args) {
		
	
LinkedHashMap<String, String> hmap=new LinkedHashMap<String,String>();
hmap.put("firstname","Gitika");
hmap.put("lastname","Madan");
hmap.put("Domain", "Testing");
System.out.println(hmap.toString());

	}
}
