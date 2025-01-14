abstract class a{
    abstract public void show();
}
public class annonymus_inner {
    public static void main(String[] args) {
        a obj=new a(){
            public void show(){
                System.out.println("in new style of show");
            }
        };
        obj.show();;
    }
}
