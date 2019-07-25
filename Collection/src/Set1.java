import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new TreeSet<>();
		s.add("F");
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("A");
		s.add("G");
		System.out.println(s.size());
		System.out.println(s);

	}

}
