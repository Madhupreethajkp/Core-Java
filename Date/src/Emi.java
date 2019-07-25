import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class UserMainCode1{
       public static void displayDate(Date date) {
              SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
              Calendar cal=Calendar.getInstance();
              cal.setTime(date);
              cal.add(Calendar.MONTH, -20);
              System.out.println(sdf.format(cal.getTime()));
       }
}
public class Emi {

       public static void main(String[] args) throws ParseException {
              Scanner sc=new Scanner(System.in);
              String date=sc.nextLine();
              SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
              Date date1=sdf.parse(date);
              UserMainCode1.displayDate(date1);

       }

}

