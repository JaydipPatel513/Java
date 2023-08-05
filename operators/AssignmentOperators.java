package operators;

public class AssignmentOperators 
{

	public static void main(String[] args)
	{
		int a=5;
		int b= a+=2;
		int c= a-=2;
		int d= a*=2;
		int e= a/=2;
		int f= a%=2; //gives reminder
		
		int g= a<<=1;
		int h= a>>=1;
		
		int x=2;
		int y= x&=3;
		int z= x|=3;
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		System.out.println(y);
		System.out.println(z);

	}

}
