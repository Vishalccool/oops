package DefaultMethodsinInterface;

public class ImpClass implements Inter
{
	//write default methods from interface
	
	public void method5()
	{
		System.out.println("method 5 in imp class");
	}
	
	public static void main(String[] args) 
	{
		ImpClass x = new ImpClass();	
		x.method5();
		
	}
}