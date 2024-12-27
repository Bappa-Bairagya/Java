public class prime_upto10 {
    static void check(int n){
        int count=0;
        //System.out.println(n);
        for(int i=1;i<n;i++){
            if (n%i==0) {
                count++;
            }
        }
        //System.out.println(count);
        if (count==1) {
            System.out.println("this numbeer is prime "+n);
        }
    }
    public static void main(String[] args) {
        System.out.println("Here i print upto 10 prime number");
        int n=10;
        for(int i=1;i<=n;i++){
            check(i);
        }
    }
}
