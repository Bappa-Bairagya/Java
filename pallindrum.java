import java.util.Scanner;

public class pallindrum {
   void operation(int n){
        int rev=0;
        int temp=n;
        while (n!=0) {
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        
        if (temp==rev) {
            System.out.println("this number is palindram");
        }
        else
        System.out.println("not");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        new pallindrum().operation(n);
        
        
    }
}
