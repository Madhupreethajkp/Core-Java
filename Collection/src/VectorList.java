import java.util.Enumeration;
import java.util.Vector;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class VectorList {
public static void main(String[] args) {
	Vector v=new Vector(3,2);
	System.out.println(v.size()+" "+v.capacity());
	v.add(1);
	v.add(2);
	v.add(3);
	v.add(4);
	System.out.println(v.size()+" "+v.capacity());
    v.add(6);
    v.add(5);
    System.out.println(v.size()+" "+v.capacity());
    System.out.println(v);
    
    //Enumeration interface (legacy)
    Enumeration e=v.elements();
    while(e.hasMoreElements()) {
    	System.out.println(e.nextElement());
    }
    
}
}
