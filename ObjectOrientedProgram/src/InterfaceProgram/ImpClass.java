package InterfaceProgram;

public class ImpClass implements Inter
{

	@Override
	public void method1() 
	{
		System.out.println("Hiiii-method1");		
	}

	@Override
	public void method2() 
	{
		System.out.println("Hiiii-method2");		
	}
	
	public static void main(String[] args) 
	{
		ImpClass x = new ImpClass();
		x.method1();
		
		
		
		//calling static methods
		Inter.method3();
	//	ImpClass.method3();          //not possible
		
	}
	
}