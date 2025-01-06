class calulate{
    int fact(int n){
        if (n==1) {
            return n;
        }
        else{
            return(n*fact(n-1));
        }
    }
}

public class factorial_recurson {
    public static void main(String[] args) {
        calulate cal=new calulate();
        int result=cal.fact(9);
        System.out.println("Factorial is= "+result);
    }
}
