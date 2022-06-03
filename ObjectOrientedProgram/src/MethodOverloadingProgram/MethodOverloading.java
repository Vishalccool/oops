package MethodOverloadingProgram;

public class MethodOverloading 
{
	public static void method1()
	{
		System.out.println("Hiii");
	}
	
	public static void method1(int a)
	{
		System.out.println("Hello");
	}
	
	public static void method1(int a, int b)
	{
		System.out.println("Bye");
	}
	
	public void method2()
	{
		System.out.println("Non static - Hiii");
	}
	
	public void method2(int a)
	{
		System.out.println("Non static - Hello");
	}
	
	public void method2(int a, int b)
	{
		System.out.println("Non static - Bye");
	}

	
	
	public static void main(String[] args) 
	{
		method1();
		method1(5);
		method1(5,5);
		
		MethodOverloading x = new MethodOverloading();
		x.method2();
		x.method2(8);
		x.method2(8, 7);
	}
}