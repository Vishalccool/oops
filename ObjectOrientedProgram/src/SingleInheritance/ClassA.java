package SingleInheritance;

public class ClassA
{
	public  static int method1(int a)

    {
   	 System.out.println("static-ClassA-method1");
      return a =10;
    }
    
  public int method2(int b)
    {
   	 System.out.println("non-static-ClassA-method2");
    return b = 20;
    }
    
    public static void main(String[] args) 
    {
   	 
   	 //static
//   	 method1();
//   	 ClassA.method1(); 
//   	 
//   	//non-static 
//   	 ClassA a = new ClassA();
//   	 a.method2();
//   	 
		
	 }
     
}



