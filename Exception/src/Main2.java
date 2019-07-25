
public class Main2 {
  static void demoproc() {
	  try {
		  throw new NullPointerException();
	  }
	  catch(NullPointerException e1) {
		  System.out.println("Caught"+e1);
		  throw e1;
	  }
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demoproc();
		}
		catch(NullPointerException e) {
			System.out.println("Recaught"+e);
		}

	}

}
