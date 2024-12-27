public class prime_upto100 {
    static boolean check(int n){
        
        int c=0;
        for(int i=1;i<=n;i++){
            if (n%i==0) {
                c++;
            }
        }
        if (c==2) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Here i print upto 100 prime number");
        int n=100;
        for(int i=1;i<=n;i++){
            if (check(i)) {
                System.out.println(i+"");
            }
        }
    }
}
