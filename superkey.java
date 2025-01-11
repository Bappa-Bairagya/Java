class a{
    public a(){
        System.out.println("in a");
    }
}
class b extends a{
    public b(){
        super();
        System.out.println("in b");
    }
    public b(int a){
        this();
        System.out.println("in b int");
    }
}

public class superkey {
    public static void main(String[] args) {
        b c=new b(5);
    }
}
