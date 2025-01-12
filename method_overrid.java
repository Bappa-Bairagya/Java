class a{
    void show(){
        System.out.println("in a show");
    }
}
class b extends a{
    void show(){
        System.out.println("in b show");
    }
}
public class method_overrid {

    public static void main(String[] args) {
       b a=new b(); 
       a.show();
    }
}