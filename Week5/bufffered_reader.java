package Week5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufffered_reader {

	public static void main(String[] args) throws IOException {
		int ch;
		FileReader fw = new FileReader("C:\\Users\\Naveen\\Desktop\\txtfile1.txt");
		BufferedReader br = new BufferedReader(fw);
//		while((ch=br.read())!=-1)
//		{
//			System.out.print((char)ch);
//		}
//		br.close();

//		// Read One Line
//		String str;
//		str = br.readLine();
//		System.out.println(str);
//
//		// Read Multiple Line
//		while ((str = br.readLine()) != null) {
//			System.out.println(str);
//		}
		char []s=new char[20];
		br.read(s,2,10);
		System.out.println(s);
		br.close();
	}

}
