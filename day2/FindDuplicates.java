package week3.day2;

public class FindDuplicates {

	public static void main(String[] args) {
		
		//Use the declared String text as input
				String sText = "We learn java basics as part of java sessions in java week1";
				
				//Initialize an integer variable as count
				int Count = 0;
				String duplicates = "";
				//Split the String into array and iterate over it
				String[] charray = sText.split(" ");
				
				for(int i=0; i<charray.length; i++)
				{
					
					for(int j=i+1;j<charray.length -1;j++)
					{
						if(charray[i].equals(charray[j]))
						{
							charray[j] = "";
							Count++;
						}	
					}
					duplicates = duplicates + " " + charray[i];
				}
				System.out.println(duplicates);
			}

		

	}


