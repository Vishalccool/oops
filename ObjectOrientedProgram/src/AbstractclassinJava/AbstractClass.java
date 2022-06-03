package AbstractclassinJava;

public abstract class AbstractClass 
{
	
	//complete methods
   public static void method1()
   {
	   System.out.println("complete method -static- method1");
   }
   
   public  void method2()
   {
	   System.out.println("complete method -non-static- method2");
   }
   
    //incomplete methods
   public abstract void method3();
   
//   public abstract static void method4();      //not possible
   
//   public static void main(String[] args) 
//   {
//	 //  AbstractClass x = new AbstractClass();     // not possible
//   }
	
}
