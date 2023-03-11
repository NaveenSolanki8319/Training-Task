package Week5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class buffered_writer  {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("C:\\Users\\Naveen\\Desktop\\txtfile1.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(" New Data to add");
		bw.close();

	}

}
