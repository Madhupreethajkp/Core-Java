
public class TargetAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TargetAnnotation t=new TargetAnnotation();
		t.show();

	}
	@Example(add="Hello")
	void show() {
		System.out.println("This is show method");
	}

}
