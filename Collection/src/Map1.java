import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Double> hm=new Hashtable<String,Double>();
		System.out.println(hm.size());
		hm.put("john", 234.45);
		hm.put("Jane baker", 2341.97);
		hm.put("RAlph", 23.34);
		hm.put("Tom", -123.2);
		hm.put("John doe", 234.54);
		hm.put("Tom", 3457.2);
		System.out.println(hm.size());
		System.out.println(hm);
		Set s=hm.entrySet();
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry me=(Map.Entry) i.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		s=hm.keySet();
		i=s.iterator();
		while(i.hasNext()) {
			String s1=(String) i.next();
			System.out.println(s1+" "+hm.get(s1));
		}
		
       Enumeration e=hm.keys();
       while(e.hasMoreElements()) {
    	   String s2=(String) e.nextElement();
    	   System.out.println(s2+" "+hm.get(s2));
       }
       
	}

}
