import java.util.ArrayList;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		float average;
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		for(int a:al) {
			sum=sum+a;
		}
		System.out.println(sum);
	 average=(float)sum/n;
	 System.out.println(String.format("%.2f", average));
			
	}

}
