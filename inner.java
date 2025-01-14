class a{
    void show(){
        System.out.println("show by a");
    }
}
public class inner {
    public static void main(String[] args) {
        a a=new a(){
            void show(){
                System.out.println("show by new");
            }
        };
        a.show();
    }
}
