package oops;

public class InheitanceSubClassProgram extends InheritanceSuperClassProgram 
{
	int c =30;
	int d =40;
	
	public void method3()
	{
		System.out.println("method3-non-static-SubClass");
	}
	
	public static void method4()
	{
		System.out.println("method4-static-SubClass");
	}
	
	
	public static void main(String[] args) 
	{
		//non-static
		InheitanceSubClassProgram  y = new InheitanceSubClassProgram ();
		y.method3();
		y.method1();
		
		//static 
		InheitanceSubClassProgram .method4();
		InheritanceSuperClassProgram .method2();    //static-superclass--superclass name 
		
		InheitanceSubClassProgram.method2();      // static -superclass --subclass name
		
		
		
		
		//
		InheritanceSuperClassProgram  z = new InheritanceSuperClassProgram ();
		z.method1();
	}

}
