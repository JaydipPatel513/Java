package arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n = sc.nextInt();
		
        int marks[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
        	marks[i] = sc.nextInt();
        }
        
        double averageMarks = 0;
        for(int i=0; i<n; i++)
        {
        	averageMarks = averageMarks + marks[i];
        }
        
        averageMarks = averageMarks / n;
        
        System.out.println("the average Marks are :"+averageMarks);
        sc.close();
	}

}
