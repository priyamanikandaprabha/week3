package week3.day1;

public class ReverseName {
//Reverse name using string
	public static void main(String[] args) {

       String word = "Kavinayaaa";
       String rev = "";
       int length = word.length();
       System.out.println(length);
       System.out.println(rev);
       
       char[] charArray = word.toCharArray();	
       for(int i=charArray.length-1; i>=0; i--) {
    	   rev = rev+charArray[i];
    	   
       }
       System.out.println("Original String:"  +word);
       System.out.println("Reversed String:"  +rev);
	}

}
