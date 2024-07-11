package Hybrid_Level_Inheritance;

class parentclass
{
	
	static void paretmethodadd()
	
	{
		System.out.println("we can add parent method");
		
	}
}
 
public class Singlelevel extends parentclass


{
	
 static void Childmethodadd() 
 {
	 System.out.println("we can add child method");
 }
 
 public static void main(String[] args) 
 
 {
	 Childmethodadd();
	 paretmethodadd();
 }
 
}
