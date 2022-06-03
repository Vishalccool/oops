package MethodHidingConcept;
//Method Hiding Concept -For Static Methods Only
public class SubClass extends SuperClass
{
	public  static void demo()
	{
		System.out.println("Hello-SubCLass");
	}
	
	public static void main(String[] args) 
	{	
		SubClass.demo();	
	}
}