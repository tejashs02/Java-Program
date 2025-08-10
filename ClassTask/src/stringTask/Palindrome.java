package stringTask;

public class Palindrome 
{
	public static boolean isPalindrome(String str)
	{
		int left=0;
		int right=str.length()-1;
		while(left < right)
		{
			if(str.charAt(left)!=str.charAt(right))
				return false;
			else
			{
				left++;
				right--;
			}
		}
		return true;
		
	}
	public static void main(String[] args) 
	{
		String s1="Madam";
		/*int left=0;
		int right=s1.length()-1;
		while(left < right)
			{
			if(s1.charAt(left)!=s1.charAt(right))
			{
				break;
			}
			left++;
			right--;
			}
		if(left==right)
			System.out.println("Yes its palindrome");
		else
			System.out.println("NOT");*/
		if(isPalindrome(s1))
			System.out.println("Yes String is palindrome");
		else
			System.out.println("String is not palindrome");
	}
}
