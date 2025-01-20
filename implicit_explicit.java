public class implicit_explicit {
    public static void main(String[] args) {
        System.out.println("here it's implicit");
        int n=40;
        long l=n;
        float f=l;
        System.out.println(f);
        System.out.println("here it's explicit");
        double d=50.0d;
        float c=(float)d;
        long h=(long)c;
        int i=(int)h;
        System.out.println(i);
    }
}
