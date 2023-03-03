package abstractTask;

import java.util.Scanner;

public class Reactangle extends Shape {

	Scanner sc = new Scanner(System.in);

	@Override
	public void perimeter() {
		double length = 0, width = 0;
		System.out.println("Enter Length of Rectangle :- ");
		length = sc.nextDouble();

		System.out.println("Enter Width of Rectangle :- ");
		width = sc.nextDouble();

		System.out.println("Perimeter of Rectangle :- " + (2 * (length + width)));
	}

	@Override
	public void area() {
		double length = 0, width = 0;
		System.out.println("Enter Length of Rectangle :- ");
		length = sc.nextDouble();

		System.out.println("Enter Width of Rectangle :- ");
		width = sc.nextDouble();

		System.out.println("Area of Rectangle :- " + (length * width));
	}

}
