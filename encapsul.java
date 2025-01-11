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
        demo d=new demo();
        d.setage(18);
        d.setname("pritam");
        System.out.println(d.getage());
        System.out.println(d.getname());
    }
}
