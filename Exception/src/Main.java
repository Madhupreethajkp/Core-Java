
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			int d,a=10;
		
		d=a/0;
		System.out.println(d);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Divide by zero");
		}
	}

}
