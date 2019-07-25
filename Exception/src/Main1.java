
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int b=42/1;
			
		int[] c= {1};
		c[33]=42;
		
		}
		/*
			catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println(e1);
		
		}
		
		catch(Exception e) {
			System.out.println("Divide by zero");
		}*/
			
		 catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			 System.out.println(e);
		 }

	}

}
