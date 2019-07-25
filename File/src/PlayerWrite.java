import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PlayerWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("src\\playerWrite.csv",true);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the player");
		String s=sc.nextLine();
		System.out.println("Enter the team name");
		String s1=sc.nextLine();
		System.out.println("Enter the number of matches played");
		String s2=sc.nextLine();
		fw.write(s+",");
		fw.write(s1+",");
		fw.write(s2+",");
fw.close();
	}

}
