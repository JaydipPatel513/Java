package conditionalstatements;

public class TernaryOperator
{

	public static void main(String[] args)
	{
       int a=15;
       int b=50;
       
       int maxOfBothNumbers=0;

//       if(a>b)
//       {
//         System.out.println(maxOfBothNumbers=a);
//       }
//       else
//       {
//    	 System.out.println(maxOfBothNumbers=b);
//       }
       
       // variable = condition ? ifTrue : ifFalse ;
       maxOfBothNumbers = a>b ? a : b;
        
        System.out.println("max of both numbers" +maxOfBothNumbers);
       
     }

}
