package string;

public class Anagrams {

	public static void main(String[] args) 
	{
//		String a="cat";
//		String b="act";
		
//		String a="silent";
//		String b="listen";
		
		String a="aab";
		String b="abc";
		
		boolean isAnagram=false;
		boolean visited[]=new boolean[b.length()];
		
		if(a.length()==b.length())
		{
			for(int i=0; i<a.length(); i++)
		{
			char c=a.charAt(i);
			isAnagram=false;
			
			for(int j=0; j<b.length(); j++)
			{
				if(b.charAt(j) == c && !visited[j])
				{
					visited[j]=true;
					isAnagram=true;
					break;
				}
			}
			if(!isAnagram)
			{
				break;
			}
		}
		}
		if(isAnagram)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}

	}

}

// second method : first sorting of strings and then compare it , if both are same then anagram otherwise not anagram. 
