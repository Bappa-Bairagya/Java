class  child{
    int otp=789;
    
}//7797451019
class parent extends child{
    void submit(){
        System.out.println("good");
    }
}

public class oops_inheritence {
    public static void main(String[] args) {
        parent p=new parent();
        p.submit();
        System.out.println(p.otp);
    }
}
