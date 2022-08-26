package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
        // a) Declare A String value as"madam"
		String Names = "MADAM";
		// b) Declare another String rev value as ""
		String reverse = "";
		
		// c) Iterate over the String in reverse order
		for(int i=Names.length()-1; i>=0; i--)
		{
			// d) Add the char into rev 
			reverse = reverse+Names.charAt(i);
		   // Using .equals method here
			if(Names.equals(reverse)) 

			 	 System.out.println("Palindrome");
			 	 
			 	 else
			 	 System.out.println("Not Palindrome");
			}
		}
}	
		
		
		
		