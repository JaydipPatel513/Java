package conditionalstatements;

public class TernaryNestedIf 
{

	public static void main(String[] args) 
	{ 
	   int a=12 , b=800 , c=100;
	   int result=0;
	   
	   result = a>b ? a>c ? a : c : b>c ? b : c;
	   
	   System.out.println("largest number is : " +result);

	}

}
