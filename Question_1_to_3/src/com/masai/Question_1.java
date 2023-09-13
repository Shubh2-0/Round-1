package com.masai;

public class Question_1 {
	
	
	public static Boolean check(String str){
		int s =0;
		int e = str.length()-1;

		while(s<e){

		if(str.charAt(s) != str.charAt(e)) return false;

		s++;
		e--;

		}
		        
		 return true;
		}


	
}
