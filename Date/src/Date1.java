import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date();
		System.out.println(d1); // prints current date and time
    Date d2=new Date(100000);
    System.out.println(d2); // prints date and time from jan 1 st 1970
    System.out.println(d1.compareTo(d2)); //checks both are equal 
    System.out.println(d1.before(d2)); // checks d2 is before d1
    System.out.println(d1.after(d2)); // checks after
    System.out.println(d1.getTime()); // returns milliseconds of d1 from jan 1 st 1970
	}

}
