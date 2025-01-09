public class stringnew {
    public static void main(String[] args) {
        String str=new String("bappa");
        
        String s1=new String("bappa");
        System.out.println(s1.equals(str));//it will check value
        System.out.println(s1==str);//it will check addres
        String s="hello";
        String e="hello";
        System.out.println(s.equals(e));
        System.out.println(s==e);
    }
}
