package AbstractclassinJava;

public class ConcreteClass extends AbstractClass
{

	public void method3()
	{
		System.out.println("method3 completeed in concrete class");
	}
	
	public static void main(String[] args) 
	{
		// incomplete is complete and executed
		ConcreteClass x = new ConcreteClass();
		x.method3();
		
		//static
		AbstractClass.method1();
		ConcreteClass.method1();
		
		//non static
//		AbstractClass x = new AbstractClass();    //not possible
		
		x.method3();
		
	}
	

}