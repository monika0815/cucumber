package com.java.test;

public class CountCharacterOccurence {

	
	    public static void main(String[] args)
	    {
	        String s = "Java is javaaaaa again java again";
	 
	       // char c = 'a';
	 
	        int count = s.length() - s.replace("a", "").length();
	 
	        System.out.println("Number of occurances of 'a' in "+s+" = "+count);
	    }
	}

