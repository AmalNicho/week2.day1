package week2.day1.Assignment;



public class ReverseEvenWords {
	public static void main(String[] args) {
		
String test = "I am a software tester"; 
		
		String[] x=test.split(" ");
	 for (int i = 0; i < x.length; i++) 
	 {
		if (i%2==0)
		{
			System.out.print(x[i]+" ");
		}
		
		else 
		{
			char[] charArray = x[i].toCharArray();	
			
		for (int j = (charArray.length)-1; j >= 0; j--) {
		System.out.print(charArray[j]);	
		} 
		System.out.print(" ");
		
		}
			
		
		}
			
			
		 
	}
	}
