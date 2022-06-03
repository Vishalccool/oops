package CastingInJava;

public class PrimitiveCastingPrograms 
{
	public static void main(String[] args) 
	{
		
		//Implicite Casting--Automatically
		int a =10;           //4 byte
		
		double b;            // 8 byte
		
		b =(double) a;          //casting is happening here
		
		System.out.println("Before Casting");
		System.out.println(a);
		
		System.out.println("After Casting");
		System.out.println(b);
		
		
		//Explicite Casting --Manually
		
		double c  = 20.65;
		int d;
		d = (int)c;      //casting is happening here
		
		//first c variable is converted into int datatype and 
		// then that c value is assigned to d int data type.
		
		// int = double   --> not possible
		//      convert the double into int --> (int)double
		
		
		System.out.println("Before Casting");
		System.out.println(c);
		
		System.out.println("After Casting");
		System.out.println(d);
		
		//ex.3
		long x = 10l;       //8 byte
		int y;              // 4 byte
		
		y = (int)x;
		System.out.println(x);
		System.out.println(y);
		
		long z;
		z =y;
		System.out.println(z);
				
	}

}