import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SimpleDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		Date d=new Date();
		System.out.println(d);
		System.out.println("Enter date of birth(dd/MM/yy)");
		String dob=sc.nextLine();
         SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yy");
         sd.setLenient(false);
         Date d1=null;
         try {
        	  d1=sd.parse(dob);
        	 System.out.println(d1);
         }
         catch(ParseException e) {
        	 System.out.println(e);
         }
         
         
         SimpleDateFormat sd1=new SimpleDateFormat("dd-MM-yyyy");
         String s2=sd1.format(d1);
         System.out.println(s2);
	}

}
