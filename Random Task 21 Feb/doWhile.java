import java.util.Date;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double startTime= new Date().getTime();
		double i=-999999999;
		do
		{
			i++;
		}while(i<999999999);
		double endTime= new Date().getTime();
		double ans=endTime-startTime;
		System.out.print(ans);
	}

}
