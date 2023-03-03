import java.util.Scanner;

public class Ques2 {
	public static void main(String args[])
	{
		int arrSize;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array :- ");
		arrSize=sc.nextInt();
		if(arrSize<=0)
		{
			System.exit(0);
		}

		int []arr=new int[arrSize];
		for(int i=0;i<arrSize;i++)
		{
			System.out.println("Enter element "+(i+1)+":- ");
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		
		if(arrSize==1)
		{
			System.out.println("Enter first Highest:- "+arr[0]);
			System.out.println("Enter Second Highest:- "+arr[0]);
			System.exit(0);
		}
		
		int firstHighest=0,secondHighest=0;
		for(int i=0;i<arrSize;i++)
		{
			if(arr[i]>firstHighest)
			{
				secondHighest=firstHighest;
				firstHighest=arr[i];
			}
			if(firstHighest>arr[i] && arr[i]>secondHighest)
			{
				secondHighest=arr[i];
			}
		}
		
		System.out.println("Enter first Highest:- "+firstHighest);
		System.out.println("Enter Second Highest:- "+secondHighest);
		
		sc.close();
		
	}

}
