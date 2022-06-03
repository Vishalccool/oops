package InterfaceProgram;

public interface Inter 
{
     int a = 50;              
    
      void method1();
      void method2();
      
      
      //we can write static methods but its not a good practice
     static void method3()         //dont write
     {
    	 System.out.println("Hello-static method3");
     }
     
     public static void main(String[] args)  //dont write
     {
    	 Inter.method3();
	 }

}