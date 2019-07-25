import java.io.FileWriter;
import java.io.IOException;

public class File3 {
	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("C:\\preetha\\a.txt",true);
		fw.write("Welcome to Java.");
		fw.close();
	}

}
