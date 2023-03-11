package Week5;

import java.util.InputMismatchException;
import java.util.Scanner;

//class MyException extends Exception
//{
//	MyException(String message)
//	{
//		super(message);
//	}
//}
//or
class MyException extends RuntimeException
{
	MyException(String message)
	{
		super(message);
	}
}
public class Ques6_Custom_Exception {

	public static void main(String[] args) {
		int num1,num2,res=0;
		Scanner sc=new Scanner(System.in); 
		try {
			System.out.println("Enter No. 1 :- ");
			num1=sc.nextInt();
			System.out.println("Enter No. 2 :- ");
			num2=sc.nextInt();
			if(num2==1) throw new MyException("Number can't divide by 1"); 
			res=num1/num2;
			System.out.println("Result = "+res);
		}
		catch (MyException e ) {
			System.out.println("User Defined Exception "+e);
		}
		catch (InputMismatchException e ) {
			System.out.println("User entered wrong parameter");
		}
		catch (ArithmeticException e ) {
			System.out.println("Arithmetic Exception num2 can't be zero");
		}catch (Exception e ) {
			System.out.println(e);
		}finally {
			System.out.println("This is end of program");
		}
	}

}
