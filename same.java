public class same {
    int a;
    int b;
    same(){
           this.a=5;
           this.b=6; 
    }
    int value(){
        return a+b;
    }
    public static void main(String[] args) {
        same foo = new same();
        System.out.println(foo.value());
    }
}
