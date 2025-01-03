class atm{
    private int atmpin=5432;
    public int  get_atmpin(){
        return atmpin;
    }
    void set_atmpin(int atmpin){
        this.atmpin=atmpin;
    }
}
public class oops_encapsulation {
    
    public static void main(String[] args) {
        atm foo = new atm();
        
        System.out.println(foo.get_atmpin());
        foo.set_atmpin(3241);
        System.out.println(foo.get_atmpin());
        
    }
}
