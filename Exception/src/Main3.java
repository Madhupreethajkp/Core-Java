
public class Main3 {
 static void procA(){
	 try {
		 System.out.println("Inside procA");
		 throw new RuntimeException();
	 }
	 catch(Exception e){
		System.out.println("Excep"); 
	 }
	 
	 finally {
		 System.out.println("procA finally");
	 }
 }
 static void procB(){
	 try {
		 System.out.println("Inside procB");
		 return;
	 }
	 finally {
		 System.out.println("procB finally");
	 }
 }
 static void procC(){
	 try {
		 System.out.println("Inside procC");
		 
	 }
	 finally {
		 System.out.println("procC finally");
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			procA();
			
		}
		catch(Exception e) {
			System.out.println("Caught "+e);
		}
		procB();
		procC();

	}

}
