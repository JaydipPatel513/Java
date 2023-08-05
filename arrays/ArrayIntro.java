package arrays;

public class ArrayIntro {

	public static void main(String[] args)
	{
		// dataType[] arrayName = new dataType[n];
		
		// dataType[] arrayName;
		//arrayName = new dataType[];
		
		
		//int[] marks = new int[5];
		//int marks[] = new int[5];
		  
		// System.out.println(marks[4]);
		
        // int[] marks;
        // marks = new int[10];
		
		int[] age= {2,5,1,32,12};
		
		double[] marks = {1.0,3.14,2.9};
		
		System.out.println(age[0]);
		System.out.println(age[4]);
		
		System.out.println(marks[0]);
		System.out.println(marks[2]);
		
		//update value
		
//		age[0]=20;
//		age[4]=50;
//		marks[0]=2.5;
//		
//		System.out.println(age[0]);
//		System.out.println(age[4]);
//		System.out.println(marks[0]);
		
		System.out.println();
		
		for(int i=0; i<age.length; i++)
		{
			System.out.println(age[i]);
		}
		
		
	}

}
