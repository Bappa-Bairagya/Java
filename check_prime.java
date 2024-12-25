public class check_prime {
    static void check(int n){
        int count=0;
        //System.out.println(n);
        for(int i=1;i<n;i++){
            if (n%i==0) {
                count++;
            }
        }
        System.out.println(count);
        if (count==1) {
            System.out.println("this numbeer is prime");
        }
        else{
            System.out.println("this is not prime");
        }
    }
    public static void main(String[] args) {
        check(1);
    }
}
