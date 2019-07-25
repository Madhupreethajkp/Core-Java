import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calender1 {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println(c.getTime());
		Date d1=new Date(2000000);
		Calendar c1=Calendar.getInstance();
		c1.setTime(d1);
		System.out.println(c1.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
	c.add(Calendar.YEAR,-4);
		System.out.println(c.get(Calendar.YEAR));
		c.set(Calendar.MONTH, 4);
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.getMaximum(Calendar.YEAR));
		System.out.println(c.getMinimum(Calendar.YEAR));
		System.out.println(c1.getActualMaximum(Calendar.MONTH));
		System.out.println(c1.getActualMinimum(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		GregorianCalendar g=new GregorianCalendar();
		System.out.println(g);
		int year=g.get(Calendar.YEAR);
		System.out.println(g.isLeapYear(year));
		
	}

}
