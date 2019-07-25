import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
class UserMainCode{
	
	static void displayDate(String s) {
		Date d=new Date(s);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
        String strDate = formatter.format(d);
        System.out.println(strDate);
		
	}
}
public class EDate1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		UserMainCode.displayDate(s);
		


	}

}
