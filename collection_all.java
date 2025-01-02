import java.util.ArrayList;
import java.util.LinkedList;

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
        System.out.println(list);
        
    }
}
