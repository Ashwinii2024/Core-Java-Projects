package Hybrid_Level_Inheritance;

class Multi_level extends Herirachical
{
	void Multi_level() {
		final double pi = Math.PI;
		System.out.println(pi);
	}
}

class Multi_level2 extends Multi_level 
{
	void Multi_level2()
	
	{
		System.out.println("Multilevel2");
		
		
		
		
	}
}

public class Multilevelinheritance  extends Multi_level2      //child class


{
  static void add()
   {
	  
	 final double r = Math.random();
	  System.out.println(r);
	  
	  
	  
  }
  
  public static void main(String[] args)
  
  {
	  Multilevelinheritance M1 = new Multilevelinheritance();
	  M1.Multi_level2();
	  M1.Multi_level();
	  add();
	  xyz();
  }
	 
}
