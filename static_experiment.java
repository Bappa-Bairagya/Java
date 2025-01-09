class demo{
    static{
        System.out.println("outside class");
    }
}
public class static_experiment {

    static{
        System.out.println("inside class");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //i need to call this outer class
        Class.forName("demo");
    }
}
