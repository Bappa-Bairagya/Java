interface a{
    void cll();
}
interface b{
    void beta();
}

public class multiple_inheritance implements a,b {
    
        public void cll(){
            System.out.println("call");
        }
        public void beta(){
            System.out.println("beta");
        }
     
    public static void main(String[] args) {
        multiple_inheritance c=new multiple_inheritance();
        c.beta();
        c.cll();
    }
}
