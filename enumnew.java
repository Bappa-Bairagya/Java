enum color{
    red,
    blue,
    green
}

public class enumnew {
    public static void main(String[] args) {
        color c1=color.red;
        System.out.println(c1);
        for (color c : color.values()) {
            System.out.println(c);
        }
    }
}
