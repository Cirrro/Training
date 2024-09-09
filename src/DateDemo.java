import java.text.SimpleDateFormat; 
import java.util.Date; //package

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//current date  current time
		Date d = new Date(); //date
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(d)); //simple date format
		System.out.println(d.toString());  //standard format of date
		System.out.println(sd.format(d)); //simple date format with hrs/minutes/seconds
	
		
		
		
		
	}

}
