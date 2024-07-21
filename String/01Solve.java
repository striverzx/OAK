import java.util.*;
class Solve{
	public static void main(String args[]){

		String str1="Java Programming";

		System.out.println(str1.length()); //finding the lengths of string
		System.out.println(str1.toLowerCase()); //Converting the string to upperCase
		System.out.println(str1.toLowerCase());

		System.out.println(str1.substring(5,12)); //starting and ending positions

		System.out.println(str1.startsWith("J"));//returns the boolean value
		System.out.println(str1.endsWith("K"));

		System.out.println(str1.charAt(2)); //givies the Char which present at position 2
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("a"));

		
		

		
	}
}