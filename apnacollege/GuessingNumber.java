package apnacollege;
import java.util.Scanner;

public class GuessingNumber {

	public static void main(String[] args) 
	{
	
		int mynumber = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		int usernumber = 0;
		
		do
		{
			System.out.println("Guess my number(1-100): ");
			usernumber = sc.nextInt();
			
			if(usernumber == mynumber)
			{
				System.out.println("Woohh........You are correct!!!!!");
			}
			else if(usernumber > mynumber)
			{
				System.out.println(" Your number is too large");
			}
			else
			{
				System.out.println("Your number is too small");
			}
		}while(usernumber >= 0);
        
		System.out.print("My number was : ");
		System.out.println(mynumber);
		sc.close();
		
	}

}
