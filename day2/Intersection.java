package week3.day2;



import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {

		
		// a) Declare An array for {3,2,11,4,6,7};	
		
		int a[]={3,2,11,4,6,7};
		
		// b) Declare another array for {1,2,8,4,9,7};
		
		int b[]={1,2,8,4,9,7};
		
		
		
		//create a two empty Lists - list1 & list2
				List<Integer> list1 = new ArrayList<Integer>();
				List<Integer> list2 = new ArrayList<Integer>();
				
	   // c) Declare for loop iterator from 0 to array length
				
		for(int i=0; i<a.length;i++) {
			list1.add(a[i]);
			// d) Declare a nested for another array from 0 to array length
			for(int j=0; j<b.length;j++) { 
				list2.add(b[j]);
		
				// e) Compare Both the arrays using a condition statement
			
					if(list1.get(i) == list2.get(j))
						{
							
						
					//f) Print the first array (should match item in both arrays)
					
					System.out.println(list1.get(i));
				}
				
			}
				}
			}
		
	}


	

	
		
	
	

