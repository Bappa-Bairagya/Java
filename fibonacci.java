public class fibonacci {
    static void operation(int n){
        int f1=0;
        int f2=1;
        System.out.println(f1);
        System.out.println(f2);
        for(int i=1;i<=n;i++){
            int f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }
    }
    public static void main(String[] args) {
        operation(5);
    }
}
