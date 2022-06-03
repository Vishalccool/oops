package ThisKeyProgram;

public class ThisKeyProgram 
{
	int rollNo;
	String studentName;
	double marks;
	
	public ThisKeyProgram(int rollNo, String studentName, double marks)
	{
		this.rollNo = rollNo;
		this.studentName =studentName;
		this.marks =marks;			
	}
	
	public void print()
	{
		System.out.println("Roll Number is: "+rollNo);
		System.out.println("Name  is: "+studentName);
		System.out.println("Marks are: "+marks);
	}
	public static void main(String[] args) 
	{
		ThisKeyProgram x = new ThisKeyProgram(10, "Rahul", 78.88);
		x.print();
	}

}