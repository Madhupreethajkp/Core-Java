import java.io.FileReader;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader f=new FileReader("C:\\preetha\\a.txt");
		int i;
		while((i=f.read())!=-1) // until eof
		{
			System.out.println((char)i);
			
		}
		f.close();
	}

}
