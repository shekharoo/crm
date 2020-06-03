package com.zoho.crm.generics;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParserClass{

	public static String[][] parseJson()
	{
		
	String[][] data = null;
	int size = 0;
	try
	{
       JSONParser jsonParser = new JSONParser();
       FileReader reader = new FileReader("./Login.json");
       //Read JSON file
       Object obj = jsonParser.parse(reader);
       JSONArray ja = (JSONArray)obj;
       System.out.println(ja.toJSONString());
     //This prints the entire json file
       size = ja.size();
       System.out.println("Size is: "+size);
       
     //This prints every block - one json object
       for(int i=0; i<ja.size();i++)
       {
    	   data = new String[size][size-2];
    	 //Prints whole json file
    	 JSONObject users = (JSONObject)ja.get(i);
    	 System.out.println(users);
    	 
    	 JSONObject user = (JSONObject)users.get("users");
    	 System.out.println(user);
    	 
    	   String username = (String)user.get("username");
    	   String password = (String)user.get("password");
    	   System.out.println("Username is: "+ username);
    	   System.out.println("Password is: "+ password);
    	   
    	 
       }
	
	}catch(Exception e) {
		System.out.println("Error in file parsing..");
	}
	return data;
}
	
	
	public static void main(String[] args) {
		String[][] data = parseJson();
	}
}
