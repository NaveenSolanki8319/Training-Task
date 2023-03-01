package student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentObj1=new Student();
		Student studentObj2=new Student();
		Student studentObj3=new Student();
		Student studentObj4=new Student();
		Student studentObj5=new Student();
		
		studentObj1.setRollNumber(1);
		studentObj1.setName("Arjun");
		studentObj1.setCourse("Java");
		studentObj1.setMarks1(10);
		studentObj1.setMarks2(20);
		studentObj1.setMarks3(30);
		System.out.println(studentObj1.toString());
		
		studentObj2.setRollNumber(2);
		studentObj2.setName("Balram");
		studentObj2.setCourse("C++");
		studentObj2.setMarks1(30);
		studentObj2.setMarks2(20);
		studentObj2.setMarks3(40);
		System.out.println(studentObj2.toString());
		
		studentObj3.setRollNumber(3);
		studentObj3.setName("Chetanya");
		studentObj3.setCourse("C");
		studentObj3.setMarks1(50);
		studentObj3.setMarks2(60);
		studentObj3.setMarks3(70);
		System.out.println(studentObj3.toString());
		
		studentObj4.setRollNumber(4);
		studentObj4.setName("Damodar");
		studentObj4.setCourse("Python");
		studentObj4.setMarks1(70);
		studentObj4.setMarks2(80);
		studentObj4.setMarks3(90);
		System.out.println(studentObj4.toString());
		
		studentObj5.setRollNumber(5);
		studentObj5.setName("Eklavya");
		studentObj5.setCourse("Javascript");
		studentObj5.setMarks1(20);
		studentObj5.setMarks2(60);
		studentObj5.setMarks3(30);
		System.out.println(studentObj5.toString());
		
	}

}
