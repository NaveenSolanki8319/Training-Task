import java.util.Scanner;

public class Ques1 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double principal,rate,time,si=0,ci=0;
		System.out.println("Enter Princiapl:- ");
		principal=sc.nextDouble();
		System.out.println("Enter Rate:- ");
		rate=sc.nextDouble();
		System.out.println("Enter Time:- ");
		time=sc.nextDouble();
		
		si=(principal*rate*time)/100;
		System.out.println("S.I.:- "+si);
		System.out.println("Total S.I. Amount:- "+(principal+si));
		

		ci=principal *(Math.pow((1 + rate / 100), time));
		System.out.println("C.I.:- "+ci);
		System.out.println("Total C.I. Amount:- "+(principal+ci));
		sc.close();
		
	}

}
