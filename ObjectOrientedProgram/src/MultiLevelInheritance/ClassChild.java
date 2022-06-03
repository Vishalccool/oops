package MultiLevelInheritance;

public class ClassChild extends ClassParent 
{
	public void method3()
	{
		System.out.println("ChildClassMethod");
	}

	public static void main(String[] args) 
	{
		ClassChild x = new ClassChild();
		 
	    //child class method calling-normal way
		x.method3();
		
		//parentClass
		x.method2();
		
		//grandparentmethod
		x.method1();
		
		
	}
}