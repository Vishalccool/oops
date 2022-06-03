package EncapsulationProgram;

public class AtmClass 
{
	private  int a;
	
	public void balanceCheck(int b)
	{
		a = b;
		System.out.println("the value of a is :"+a);
	}
  
	//example 2
	private int accNumber;
	private String custName;
//	private double accBalance;
	
	public void setAccNumber(int accNumber1)
	{
		accNumber = accNumber1;
		System.out.println("Acc Number is :"+accNumber);	
	}
	
	public void setCustName(String custName1)
	{
		custName = custName1;
		System.out.println("Cust Name is :"+custName);	
	}
	

}
