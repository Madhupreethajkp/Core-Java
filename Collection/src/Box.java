import java.util.Scanner;

class BoxSet{
	private double length;
	private double width;
	private double height;
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	@Override
	public String toString() {
		return "BoxSet [length=" + length + ", width=" + width + ", height=" + height + "]";
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public BoxSet(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
}
public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of boxes");
int n=sc.nextInt();
sc.nextLine();
for(int i=0;i<n;i++) {
	System.out.println("Enter the box "+(i+1)+" details");
	System.out.println("Enter length");
	double length=sc.nextDouble();
	sc.nextLine();
	System.out.println("Enter width");
	double width=sc.nextDouble();
	sc.nextLine();
	System.out.println("Enter height");
	double height=sc.nextDouble();
	sc.nextLine();
	BoxSet b=new BoxSet(length,width,height);
	
}
	}

}
