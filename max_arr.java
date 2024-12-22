public class max_arr {
    static int max(int[]a, int n){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if (a[i]>maxi) {
                maxi=a[i];
            }
        }
        return maxi;
    }
    static int min(int[]a,int n){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if (a[i]<mini) {
                mini=a[i];
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        int [] marr= {5,3,2,4,1};
        int l=marr.length;
        System.out.println("maximum value="+max(marr,l));
        System.out.println("minimum value="+min(marr, l));
    }
}
