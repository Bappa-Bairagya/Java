public class try_exception {
    public static void main(String[] args) {
        int []a={5,4,6,2};
        try {
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("oops soory");
        }
        
    }
}
