package week2.day1.Assignment;

public class FindTypes {
	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0;
		int space=0;
		int num=0; 
		int specialChar = 0;
		
		char[] charArray = test.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
if (Character.isAlphabetic(charArray[i]))
				
			{
			letter++;
			
		}
			
		
			if (Character.isDigit(charArray[i]))
			{
				num++;
			}
	
		if (Character.isSpaceChar(charArray[i]))
		{
			space++;
		}
		
		else 
		{
			specialChar++;

}

		}
		
		System.out.println("Total count of Letters are " +letter );
		System.out.println("Total count of numbers are " +num );
		System.out.println("Total count of specialChar  are " +specialChar );
		System.out.println("Total count of space  are " +space);
		
		
	}
}