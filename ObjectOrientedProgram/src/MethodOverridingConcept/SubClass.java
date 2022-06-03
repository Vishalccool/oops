package MethodOverridingConcept;

public class SubClass extends SuperClass
{
	public void demo()
	{
		System.out.println("Hello-SubCLass");
	}
	
	
	public void demo2()
	{
		System.out.println("demo2-SubCLass");
	}
	
	
	public static void main(String[] args) 
	{
//		// SuperClass Method Call
		SuperClass x = new SuperClass();
		x.demo();
			
//		// SubClass Method Call
		SubClass y = new SubClass();
		y.demo();
		
		//now call the method of superclass with object of subclass
		//method call through inheritance
		
		SubClass z = new SubClass();
		z.demo();
		z.demo1();
		z.demo2();
		
		
	}

}