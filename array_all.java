public class array_all {
    public static void main(String[] args) {
        int []a=new int[5];
        int []v={1,2,3,4,5};
        System.out.println(v[0]);
        a[0]=5;
        a[1]=6;
        a[2]=4;
        a[3]=9;
        a[4]=10;
        System.out.println(a[4]);
        System.out.println("this is 1d array");
        for(int i=0;i<a.length;i++){
            System.out.println("the array is "+a[i]);
        }
        int [][]b={{4,5,6},{7,8,9},{1,2,3}};
        System.out.println("this is 2d array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        int [][][]c={{{4,5,6},{7,8,9}},{{1,2,3},{10,25,36}}};
        System.out.println("this 3d array");
        System.out.println(c[0][1][2]);
    }
}
