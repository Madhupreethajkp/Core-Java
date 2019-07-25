import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date3 {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR , 1996);
		 System.out.println(calendar.get(Calendar.YEAR));
	}

}
