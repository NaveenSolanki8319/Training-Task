package Week5.Ques1;

import java.io.File;
import java.io.IOException;

public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("C:\\Users\\Naveen\\Desktop\\txtfile2.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.exists());
		System.out.println(f1.getName());
		System.out.println(f1.length());
		f1.delete();
		
		
		

	}

}
