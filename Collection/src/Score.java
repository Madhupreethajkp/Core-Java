import java.util.ArrayList;
import java.util.Collections;


import java.util.Map;
import java.util.Scanner;

import java.util.TreeMap;

public class Score {
       public static <K, V> K getKey(Map<K, V> map, V value) {
              for (Map.Entry<K, V> entry : map.entrySet()) {
                     if (value.equals(entry.getValue())) {
                           return entry.getKey();
                     }
              }
              return null;
       }

       public static void main(String[] args) {
              // TODO Auto-generated method stub
Map hm=new TreeMap();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of players");
int n=sc.nextInt();
sc.nextLine();
ArrayList al=new ArrayList();
for(int i=0;i<n;i++)
{
       System.out.println("Enter the details of the player"+i+1);
       String name=sc.next();
    long a=sc.nextLong();
    hm.put(name,a);
    al.add(a);
}
Collections.sort(al);
System.out.println(getKey(hm, al.get(al.size()-1)));




       }

}

