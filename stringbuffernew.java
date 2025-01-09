public class stringbuffernew {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("hiii");
        StringBuffer s2=new StringBuffer("hiii");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.reverse());
    }
}
