public class loop {
    public static void main(String[] args) {
        //for loop
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        //while loop
        int i=5;
        while (i!=0) {
            System.out.println(i);
            i=i-1;
        }
        //do while loop
        do{
            System.out.println(i);
            i++;
        }
        while(i==0);
        //for each loop
        String [] cars={"bmw","maybach","tata"};
        for (String s : cars) {
            System.out.println(s);
            
        }
    }
}
