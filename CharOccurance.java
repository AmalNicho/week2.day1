package week2.day1.Assignment;

public class CharOccurance {
	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		
		int x=0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='e')	
			{
				++x;
			}
			
			
		}
		
		System.out.println("The letter e is available "+x+ " in this sentence");
	}

}
