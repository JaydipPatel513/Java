package conditionalstatements;

public class SwitchCaseStatement {

	public static void main(String[] args)
	{
		int dayOfWeek=4;
		
//		if(dayOfWeek==1)
//		{
//			
//		}
//		if(dayOfWeek==2)
//		{
//			
//		}
//		if(dayOfWeek==3)
//		{
//			
//		}
//		if(dayOfWeek==4)
//		{
//			
//		}
//		if(dayOfWeek==5)
//		{
//			
//		}
//		if(dayOfWeek==6)
//		{
//			
//		}
//		if(dayOfWeek==7)
//		{
//			
//		}
		switch(dayOfWeek)
		{
		case 1:
			System.out.println("I am on leave");
			break;
		case 2:
			System.out.println("I am in office");
			break;
		case 3:
			System.out.println("I am playing vollyball");
			break;
			
			default:
				System.out.println("I don't know what day it is");
		}
		
	}

}
