import java.util.ArrayList;

public class collection_all {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>(5);
        for(int i=1;i<=5;i++){
            arraylist.add(i);
        }
        System.out.println(arraylist);
        arraylist.remove(3);
        System.out.println(arraylist);
    }
}
