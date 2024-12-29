public class pallindrum {
   static void operation(int n){
        int rev=0;
        int temp=n;
        while (n!=0) {
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        //System.out.println(n);
        if (temp==rev) {
            System.out.println("this number is palindram");
        }
        else
        System.out.println("not");
    }
    public static void main(String[] args) {
        operation(151);
        //System.out.println("hiiiiiiiiiiiii");
        
    }
}
