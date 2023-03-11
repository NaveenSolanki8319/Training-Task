package Week5.Ques7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ques7_Employee_Management {
	public static void main(String[] args) throws IOException {
		//For Inserting Data of Employee
//		FileOutputStream foutObj = new FileOutputStream("C:\\Users\\Naveen\\Desktop\\Eclipse Files\\Tasks\\src\\main\\java\\Week5\\Ques7\\empData.txt");
//		for (int i = 1; i <= 100; i++) {
//			char ch=(char)i;
//			String name = "Name" + i;
//			String address = "Address" + i;
//			String data = i + " " + name + " " + address;
//			for (int j = 0; j < data.length(); j++) {
//				foutObj.write(data.charAt(j));
//			}
//			foutObj.write('\n');
//		}
//		System.out.print("End of Program");
//		foutObj.close();
		
		System.out.println("Choose Your Option :-");
		System.out.println("Press 1 for :- Reading All Data of Employee");
		System.out.println("Press 2 for :- Reading Particular Record by Employee ID");
		System.out.println("Press 3 for :- Changing record of particular Employee");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt(),i=0;
		switch (key) 
		{
			case 1:
				//For Reading All Data of Employee
				FileInputStream finObj = new FileInputStream("C:\\Users\\Naveen\\Desktop\\Eclipse Files\\Tasks\\src\\main\\java\\Week5\\Ques7\\empData.txt");
				
				do {
					i = finObj.read();
					System.out.print((char) i);
				} while (i != -1);
				finObj.close();
				break;
			case 2:
				//For Reading Particular Record
				FileReader fw = new FileReader("C:\\Users\\Naveen\\Desktop\\Eclipse Files\\Tasks\\src\\main\\java\\Week5\\Ques7\\empData.txt");
				BufferedReader br = new BufferedReader(fw);
				String str=null;
				System.out.println("Enter Employee I.D. :- ");
				int empId=sc.nextInt();
				if(!(empId>=1 && empId<=100))
				{
					System.out.println("Entered Employee I.D. is Invalid");
					System.exit(0);
				}
				for(i=1;i<=empId;i++)
				{			
					str = br.readLine();
				}
				System.out.println(str);
				break;
			case 3:
				//For Changing record of particular Employee
				fw = new FileReader("C:\\Users\\Naveen\\Desktop\\Eclipse Files\\Tasks\\src\\main\\java\\Week5\\Ques7\\empData.txt");
				br = new BufferedReader(fw);
				System.out.println("Enter Employee I.D. :- ");
				empId=sc.nextInt();
				if(!(empId>=1 && empId<=100))
				{
					System.out.println("Entered Employee I.D. is Invalid");
					System.exit(0);
				}
				str="";
				String oldData =br.readLine(),newData="";
				for(i=2;i<empId;i++)
				{	
					str = br.readLine();
					oldData=oldData+"\n"+str;
				}
				str = br.readLine();
				System.out.println(oldData);
				System.out.println(str);
				System.out.println("Enter Employee New Name :- ");
				String newName=sc.next();
				System.out.println("Enter Employee New Address :- ");
				String newAddress=sc.next();
				String newDataEmp=empId+" "+newName+" "+newAddress;
				System.out.println("Employee New Data :- "+newDataEmp);
				for(i=empId+1;i<=100;i++)
				{	
					str = br.readLine();
					newData=newData+"\n"+str;
				}
				System.out.println("Employee New Data After ID :- "+newData);
				FileWriter fwr=new FileWriter("C:\\Users\\Naveen\\Desktop\\Eclipse Files\\Tasks\\src\\main\\java\\Week5\\Ques7\\empData.txt");
				BufferedWriter bw=new BufferedWriter(fwr);
				bw.write(oldData);
				bw.write("\n");
				bw.write(newDataEmp);
				bw.write(newData);
			    bw.close();
				break;
			default:
				System.out.println("Invalid Input");
		}

		

		
		
		
	}
}
