package oops;

public class InheritanceSuperClassProgram 
{
	int a =10;
	int b =20;
	
	public void method1()
	{
		System.out.println("method1-non-static-SuperClass");
	}
	
	public static void method2()
	{
		System.out.println("method2-static-SuperClass");
	}
	
	
	public static void main(String[] args) 
	{
		//non-static
		InheritanceSuperClassProgram x = new InheritanceSuperClassProgram();
		x.method1();
		
		//static 
		InheritanceSuperClassProgram.method2();
		
		
	}

}
