interface animal {
    void sound();
    
}
class cat implements animal{
    public void sound(){
        System.out.println("mewo meow");
    }
}
class dog implements animal{
    public void sound(){
        System.out.println("bhaw bhaw");
    }
}
// class scp{
//     public static void s(animal a){
//         a.sound();
//     }
// }

public class interfacedemo {
    public static void main(String[] args) {
        cat c=new cat();
        //scp.s(c);
        c.sound();
        dog d=new dog();
        //scp.s(d);
        d.sound();
    }
}
