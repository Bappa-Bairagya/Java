class ar{
    void sound(){
        System.out.println("hindi gaaan");
    }
}
class bhalo extends ar{
    void sound(){
        System.out.println("hindi gaaan,bangla gaan");
    }
}

public class rid {

    public static void main(String[] args) {
        bhalo b=new bhalo();
        b.sound();
    }
}
