package SingleInheritance;

public class ClassB extends ClassA
{
	   public static void method3()
	     {
	    	 System.out.println("static-ClassB-method3");
	     }
	     
	     public void method4()
	     {
	    	 System.out.println("non-static-ClassB-method4");
	     }
	     
	     public static void main(String[] args) 
	     {
	    	 
	    	 // 1.normal method calling process
	    	 //static 
//	    	 ClassB.method3();
//	    	 
//	    	 //non-static
//	    	 ClassB b = new ClassB();
//	    	 b.method4();
//	    	 
//	    	 //static method calling from another class
//	    	 ClassA.method1();
//	    	 
//	    	 //normal process -non static calling from another class
//	    	 ClassA x =new ClassA();
//	    	 x.method2();
//	    	
//	    	 
	    	 //inheritance process-method calling with inheritance-(non-static)
	    	 ClassB z = new ClassB();
	    	 z.method2(10);
	    	 
	    	 method1(20);
	    	 
	    	 
	    	 
			
		 }

}

