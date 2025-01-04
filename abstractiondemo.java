abstract class value {
    int i=5;
    value(){
        System.out.println("construtor");
    }
    abstract void call();
    abstract void take();
}
class circle extends value{
    void call(){
        System.out.println("oops this is circle");
        System.out.println(i);
    }
    
    void take(){
        System.out.println("oops this is take circle");
    }
}
class squre extends value{
    void call(){
        System.out.println("squre");
        System.out.println(i);
    }
    void take(){
        System.out.println("new squre");
    }
}

public class abstractiondemo {
    public static void main(String[] args) {
        value c =new circle();
        c.call();
        c.take();
        value v=new squre();
        v.call();
        v.take();
    }
}
