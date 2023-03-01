import java.util.Date;

public class whileLoop {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			double startTime= new Date().getTime();
			double i=-999999999;
			while(i<999999999)
			{
				i++;
			}
			double endTime= new Date().getTime();
			double ans=endTime-startTime;
			System.out.print(ans);
		}
}
