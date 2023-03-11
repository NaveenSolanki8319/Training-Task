package Week5;

import java.util.ArrayList;
import java.util.List;

public class Ques3_WildCard_Generics 
{
	
	public static void main(String[] args) 
	{
		Ques3_WildCard_Generics obj=new Ques3_WildCard_Generics();
		List<Integer>list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		obj.Print_list(list1);
		
		List<String>list2=new ArrayList<>();
		list2.add("Ram");
		list2.add("Shyam");
		list2.add("Mohan");
		list2.add("Geeta");
		list2.add("Seeta");
		obj.Print_list(list2);
	}
	public void Print_list(List<?>list)
	{
		System.out.println(list);
	}
}


