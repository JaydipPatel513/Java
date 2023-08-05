package operators;

public class BitwiseOperators
{

	public static void main(String[] args)
	{
		int a=5; //0101
		int b=6; //0110
		int c=a&b; //0100
		System.out.println(c);
		
		int x=10; //1010
		int y=13; //1101
		int z=x|y; //1111
		System.out.println(z);
		
		int p=y>>1;
		int q=y>>2;
		int r=y>>3;
		
		int j=y<<1;
		int k=y<<2;
		int l=y<<3;
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		
	}

}
