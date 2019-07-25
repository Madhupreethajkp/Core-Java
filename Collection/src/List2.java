import java.util.LinkedList;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l=new LinkedList<>();
		System.out.println(l.size());
		l.add(10);
		l.add(2);
		l.add(5);
		l.addFirst(5); // since it implements DEQue  these methods are present there.
		
		l.addLast(6);
		l.add(2,8);
		System.out.println(l);
		l.remove(2);
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		

	}

}
