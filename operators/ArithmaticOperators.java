package operators;

public class ArithmaticOperators
{

	public static void main(String[] args)
	{
		int a=50;
		int b=5;
		
		int x=a+b;
		int y=a-b;
		int z=a*b;
		int s=a/b;
		int v=a*a+b*b+2*a*b;
		int p=(a+b)*(a+b);
		
		double r=(double)b/(double)a;
		
		int e=23;
		int f=45;
		int g=f%e;
		
		//int j=f++;   Ans=45
		//int j=++f;   Ans=46
		//int j=f--;   Ans=45
		//int j=--f;   Ans=44
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(s);
		System.out.println(v);
		System.out.println(p);
		System.out.println(r);
		System.out.println(g);
		//System.out.println(j);
		
	}

}
