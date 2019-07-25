import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Player {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file");
		String file=sc.nextLine();
		FileReader f=new FileReader("src\\"+file);
		int i;
		while((i=f.read())!=-1) // until eof
		{
			System.out.print((char)i);
			
		}
		f.close();

	}

}
