package EncapsulationProgram;

public class SBIBank 
{
	public static void main(String[] args) 
	{
		
		AtmClass x = new AtmClass();
		
		x.balanceCheck(5);

//		x.a =15;
//		System.out.println(x.a);
		
		x.setAccNumber(1455522);
		x.setCustName("Rahul");
	}
	

}