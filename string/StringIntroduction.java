package string;

public class StringIntroduction {

	public static void main(String[] args) 
	{
		String name = "Jaydip";
		String name2 = "Jaydip";
		
		String name3 = new String("Jaydip");
		
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.println(name == name2);
		System.out.println(name == name3);
		
		//functions
		
		String Name = "Jaydip";
		String Name2 = "";
		System.out.println(Name.charAt(0));
		
		System.out.println(Name.length());
		
		System.out.println(Name.substring(1));
		System.out.println(Name.substring(0, 3));
		System.out.println(Name.substring(2, 5));
		
		System.out.println(Name.contains("Jay"));
		System.out.println(Name.contains("jay"));
		
		System.out.println(Name.equals("Jaydip"));
		System.out.println(Name.equals("jaydip"));
		System.out.println(Name.equalsIgnoreCase("jaydip"));
		
		System.out.println(Name.isEmpty());
		System.out.println(Name2.isEmpty());
		
		System.out.println(Name.concat("Patel"));
		System.out.println(Name + "Patel");
		
		System.out.println(Name.replace('J', 'K'));
		
		System.out.println();
		
		String cars = "Tata,Maruti,Hyndai,Volvo,Ferrari,Gwagon";
		String allcars[] = cars.split(",");
		
		for(String car: allcars)
		{
			System.out.println(car);
		}
		
		System.out.println();
		
		System.out.println(Name.indexOf('d'));
		System.out.println(cars.indexOf('a'));
		System.out.println(cars.lastIndexOf('a'));
		
		System.out.println(cars.toLowerCase());
		System.out.println(cars.toUpperCase());
		
		String name5 = "     Jaydip     ";
		System.out.println(name5);
		System.out.println(name5.trim());
		
	}

}
