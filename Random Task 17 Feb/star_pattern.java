import java.util.Scanner;

public class star_pattern {
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No. of Rows:- ");
		int len=sc.nextInt();
		for(int row=1; row<=len; row++)
		{
			for(int space=len;space>=row;space--)
			{
				System.out.print(" ");
			}
			
			for(int star=1;star<=row;star++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}
