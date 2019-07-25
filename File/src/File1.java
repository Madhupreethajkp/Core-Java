import java.io.*;

public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 File f=new File("C:\\preetha\\a.txt");
 System.out.println(f.getName());
 System.out.println(f.getPath());
 System.out.println(f.getAbsolutePath());
 System.out.println(f.getParent());
 System.out.println(f.isFile());
 System.out.println(f.isDirectory());
 System.out.println(f.length());
 System.out.println(f.lastModified());
	System.out.println(f.canRead());
System.out.println(f.canWrite());
System.out.println(f.isHidden());
	}

}
