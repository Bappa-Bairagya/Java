import java.security.Key;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class collection_all {
    public static void main(String[] args) {
        //Arraylist
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for(int i=1;i<=5;i++){
            arraylist.add(i);
        }
        System.out.println(arraylist);
        arraylist.remove(3);
        System.out.println(arraylist);
        for(int i=0;i<arraylist.size();i++){
            System.out.println(arraylist.get(i));
        }
        for (Integer i : arraylist) {
            System.out.println(i);
        }
        //linkedlist
        LinkedList <String> list = new LinkedList <String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.addFirst("L");
        list.addLast("Z");
        list.add(5, "M");
        list.add("n");
        System.out.println(list.poll());
        System.out.println(list.peek());
        System.out.println(list);
        //hashset
        HashSet<String> h = new HashSet<String>();
        h.add("X");
        h.add("Y");
        h.add("Z");
        h.add("O");
        h.add("P");
        h.add("A");
        //h.add("Y");-> duplicate not allow
        System.out.println(h);
        System.out.println(h.contains("X"));
        for (String string : h) {
            System.out.println(string);
        }
        //treeset
        TreeSet<String> t = new TreeSet<String>();
        t.add("A");
        t.add("C");
        t.add("B");
        t.add("X");
        System.out.println(t.contains("A"));
        //hashmap
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Bappa");
        map.put(2, "Amal");
        map.put(3, "Tuhin");
        System.out.println(map);
        System.out.println(map.size());
        if (map.containsKey(1)) {
            System.out.println("the value is "+map.get(1));
        }
        // for (Integer k : map.keySet()) {
        //     System.out.println(map.get(k));
        // }
        // for (Entry<Integer,String> e : map.entrySet()) {
        //     //System.out.println("key="+e.getkey());
        // }
        //treemap
        TreeMap<Integer, String> tr = new TreeMap<Integer, String>();
        tr.put(1, "a");
        tr.put(3, "h");
        tr.put(2, "c");
        System.out.println(tr);
    }
}
