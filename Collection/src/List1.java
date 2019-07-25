import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<>();
		System.out.println(l1.size());
		l1.add("b");
		l1.add("c");
		l1.add("a");
		l1.add(1,"e");
		l1.add("a");
		System.out.println(l1.size());
		System.out.println(l1);
		// for loop 
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		 //for each
		for(String s1:l1) {
			System.out.println(s1);
		}
// Iterator interface used to access individual elements of collection only in forward direction
		// void remove () also present
		Iterator itr=l1.iterator();
		while(itr.hasNext()) {  // checks whethe it contains more elements
			System.out.println(itr.next());   // returns single element
		}
		
		//ListIterator can traverse in both direction 
		//boolean hasPrevious()      void remove()     void add(Object obj)   Object previous()
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		ListIterator litr=al.listIterator();
		
		while(litr.hasNext())
		{       Object element=litr.next();
		litr.set(element+"+");
			
		}
		litr=al.listIterator();
		while(litr.hasNext()) {
			Object element=litr.next();
			System.out.print(element+" ");
		}
		System.out.println();
		while(litr.hasPrevious()) {
			Object elt=litr.previous();
			System.out.print(elt+" ");
		}
		
		al.remove(2);
		al.remove("F+");
		System.out.println(al);
		ArrayList<String> al1=new ArrayList<>();
		al1.addAll(al);
		System.out.println(al1);
		System.out.println(al1.contains("C+"));
		System.out.println(al1.containsAll(al));
		al1.removeAll(al);
		System.out.println(al1);
		
		
	}

}
