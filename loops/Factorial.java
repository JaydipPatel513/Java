package loops;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
//		int fact=1;
//		int n=15;
//		for(int i=1; i<=n; i++)
//		{
//			fact = fact * i;
//		}
//		System.out.println(fact);
		
		//for user input scanner is used
	
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  
	  int factorial=1;
	  for(int i=1; i<=n; i++)
	  {
		  factorial = factorial * i;
	  }
        System.out.println(factorial);
        sc.close();
	}

}
