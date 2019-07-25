import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class ProClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		System.out.println(p.size());
		p.put("John", "Team leader");
		p.put("Tom", "Project manager");
		p.put("Sam", "Consultant");
		p.put("Ram", "Manager");
		p.put("Jin", "Analyst");
		System.out.println(p);
		Set s=p.keySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			String s1=(String) i.next();
			System.out.println(s1+" "+p.getProperty(s1));
		}
		

	}

}
