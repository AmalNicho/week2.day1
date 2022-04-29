package week2.day1.Assignment;


public class Palindrome {
	public static void main(String[] args) {
		
	 String x="madam";
	 String y="";
	 
	 //System.out.println(x.length());
	 
	
		for (int i = (x.length())-1; i >= 0; i--) {

	y=y+x.charAt(i); 
	
}
if (x.equals(y))
	
{
		System.out.println("String is palindrome");	
			
			
		}

else
	
{
	System.out.println("String is not palindrome");
}
	 
	 
	}

}