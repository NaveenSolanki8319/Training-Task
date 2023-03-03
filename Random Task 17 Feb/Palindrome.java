import java.util.*;

public class Palindrome 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a No. :- ");
		int num=sc.nextInt();
		int res=0;
		if(num%2==0)
		{
			num=num/2;
			int i=1;
			while(i<=num)
			{
				res=(res*10)+i;
				i++;
			}
			i--;
			while(i>=1)
			{
				res=(res*10)+i;
				i--;
			}
		}
		else
		{
			num=num/2;
			num++;
			System.out.println("num "+ num);	
			int i=1;
			while(i<=num)
			{
				res=(res*10)+i;
				i++;
			}
			i=i-2;
			while(i>=1)
			{
				res=(res*10)+i;
				i--;
			}
		}	
		System.out.println("Result :- "+res);	
		sc.close();
	}

}
