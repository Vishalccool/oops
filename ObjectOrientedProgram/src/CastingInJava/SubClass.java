package CastingInJava;

public class SubClass extends SuperClass
{
	public void method3()
	{
      System.out.println("SubClass-method3");
	}
	
	public void method4()
	{
      System.out.println("SubClass-method4");
	}
	
	public static void main(String[] args) 
	{
		//normal object calling
		
		//superclass
		SuperClass x  = new SuperClass();
		x.method1();
		x.method2();
		
		//subclass
		SubClass y = new SubClass();
		y.method3();
		y.method4();
		
		//inheritance
		
		y.method1();
		y.method2();
		
		
		//upcasting
		
		SuperClass z = new SubClass();
		z.method1();
		z.method2();
//		z.method3();
//		z.method4();
			
	}

}