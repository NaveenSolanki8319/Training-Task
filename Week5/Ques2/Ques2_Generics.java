package Week5.Ques2;

import java.util.ArrayList;
import java.util.List;

public class Ques2_Generics 
{
	
	public static void main(String[] args) 
	{
		Box<String> objBox1=new Box<>("Example of String");
		System.out.println(objBox1.getContainer());
		System.out.println(objBox1.container.getClass().getName());
		objBox1.performTask();
		
		Box<Integer> objBox2=new Box<>(121);
		System.out.println(objBox2.getContainer());
		System.out.println(objBox2.container.getClass().getName());
		objBox2.performTask();
		
		Box<Boolean> objBox3=new Box<>(false);
		System.out.println(objBox3.getContainer());
		System.out.println(objBox3.container.getClass().getName());
		objBox3.performTask();
		
		Box<Double> objBox4=new Box<>(12.12);
		System.out.println(objBox4.getContainer());
		System.out.println(objBox4.container.getClass().getName());
		objBox4.performTask();
		
		Object obj=new Object();
		Box<Object> objBox5=new Box<>(obj);
		System.out.println(objBox5.getContainer());
		System.out.println(objBox5.container.getClass().getName());
		objBox5.performTask();
	}
}


