class demo{
    String s;
    public static void fr(demo k){
        System.out.println(k.s);
    }
}
public class static_method {
    public static void main(String[] args) {
        demo d=new demo();
        d.s="bappa";
        demo.fr(d);
    }
}
