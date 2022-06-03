package MultiLevelInheritance;

public class ClassParent extends ClassGrandParent
{
	public void method2()
	{
		System.out.println("ParentClassMethod");
	}
	public static void main(String[] args) 
	{
		ClassParent y = new ClassParent();
		//parentmethod
		y.method2();
		
		//grandparent
		y.method1();
		
	}

}
