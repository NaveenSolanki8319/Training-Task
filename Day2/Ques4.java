import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		int num1, num2, num3, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1:- ");
		num1 = sc.nextInt();
		System.out.println("Enter Number 2:- ");
		num2 = sc.nextInt();
		System.out.println("Enter Number 3:- ");
		num3 = sc.nextInt();

		if (num1 >= num2 && num1 >= num3)
			result = num1;
		else if (num2 >= num1 && num2 >= num3)
			result = num2;
		else
			result = num3;

		System.out.println("Highest No. among 3:- " + result);
		sc.close();

	}

}
