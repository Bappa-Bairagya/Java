class a{
    void show(){
        System.out.println("this is from a");
    }
}
class b extends a{
    @Override
    void show(){
        System.out.println("in b");
    }
}
public class anotation {
    public static void main(String[] args) {
        b b=new b();
        b.show();
    }
}
