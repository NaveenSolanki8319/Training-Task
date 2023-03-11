package Week5;

public class Ques5_Throw_Throws {
	void division(int num1, int num2) throws ArithmeticException {
		if (num2 == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println("Result of division = " + (num1 / num2));
		}
	}

//	public static void main(String[] args) {
//		Ques5_Throw_Throws obj=new Ques5_Throw_Throws();
//		try {
//			obj.division(10, 0);
//		} catch (Exception e) {
//			System.out.println("Value of denomenator is 0");
//		}

//		OR

	public static void main(String[] args) throws ArithmeticException {
		Ques5_Throw_Throws obj = new Ques5_Throw_Throws();
		obj.division(10, 0);
	}

}
