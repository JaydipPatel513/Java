package scanner;
import java.util.Scanner;

public class UserInputScanner
{
   public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		//int x=sc.nextInt();
		//double y=sc.nextDouble();
		//System.out.println(x);
		
		String hello=sc.nextLine();
		System.out.println(hello);
		sc.close();

	}

}
