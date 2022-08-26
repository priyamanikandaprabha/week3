package week3.day2;

public class OddtoUppercase {

	public static void main(String[] args) {

		//Declare String Input as Follow
		  
		  String text = "changeme";
		  String Uppercasetext = "";
		// a) Convert the String to character array
		  char[] ch = text.toCharArray();
		  
		
		//b) Traverse through each character (using loop)
		  for (int i = 0; i < ch.length; i++) {
			 
			  
	    // c)find the odd index within the loop (use mod operator)
                  if(i%2==1) 
                  {
         //d)within the loop, change the character to uppercase, if the index is odd else don't change       	  
                	 
                	  Uppercasetext = Uppercasetext+Character.toUpperCase(ch[i]);  
      				
                	  
      			}
      			else {
      				
      				Uppercasetext=Uppercasetext+ch[i];


      			}
      		}
      		System.out.println(Uppercasetext);
			  }
}

		
		
		