import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		int rupees;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount in Rupees:- ");
		rupees = sc.nextInt();
		double dollar = 0.0;
		switch (rupees) {
		case 1:
			dollar = (double) 1 * 0.012;
			break;
		case 2:
			dollar = (double) 2 * 0.012;
			break;
		case 5:
			dollar = (double) 5 * 0.012;
			break;
		case 10:
			dollar = (double) 10 * 0.012;
			break;
		case 20:
			dollar = (double) 20 * 0.012;
			break;
		case 50:
			dollar = (double) 50 * 0.012;
			break;
		case 100:
			dollar = (double) 100 * 0.012;
			break;
		case 200:
			dollar = (double) 200 * 0.012;
			break;
		case 500:
			dollar = (double) 500 * 0.012;
			break;
		case 2000:
			dollar = (double) 2000 * 0.012;
			break;
		default:
			System.out.println("Invalid Option");
		}

		System.out.println("Amount in Dollar:- " + dollar);

		sc.close();

	}

}
