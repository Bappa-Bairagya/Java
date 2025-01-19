class demo{
    private String name="bappa";
    private int age=21;
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public void setage(int n){
        age=n;
    }
    public void setname(String s){
        name=s;
    }
}

public class encapsul {
    public static void main(String[] args) {
        demo l=new demo();
        l.setage(19);
        l.setname("pritam");
        System.out.println(l.getage());
        System.out.println(l.getname());
    }
}
