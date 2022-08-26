package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		int length = data.length;
		System.out.println("Length of an array:" +length);
		//Create a empty Set Using TreeSet
		Set<Integer> datalist = new TreeSet<Integer>();
		//Declare for loop iterator from 0 to data.length and add into Set
		for(int i=0; i<data.length;i++)
		{
		
			datalist.add(data[i]);
			int count =0;
			for(int j=i+1; j<data.length;j++)
			{
				if(data[i]==data[j])
				{
					count++;
				
				}
			if(count>1) {
			
			System.out.println(data[i]);
		}
			}
		}
	}
}
		
		//Print the second last element from List

	


