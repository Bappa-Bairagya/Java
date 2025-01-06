public class load {
    //method overloading
    static void call(){
        System.out.println("call 1");
    }
    static void call(int a){
        System.out.println("call 2"+a);
    }
    static void call (int a,float b){
        System.out.println("call 3");
    }
    public static void main(String[] args) {
        call();
        call(5);
        call(4, 0.1f);
    }
}
