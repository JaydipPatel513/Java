package whileLoops;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int temp=n;
		int reverseNumber=0;
		
		while(temp>0)
		{
			int lastDigit = temp % 10;
			reverseNumber = reverseNumber * 10 + lastDigit;
			temp /= 10;
			
		}
		if(reverseNumber == n)
		{
			System.out.println(n + "is pallindrome");
		}
		else
		{
			System.out.println(n + "is not pallindrome");
		}
        sc.close();
	}

}
