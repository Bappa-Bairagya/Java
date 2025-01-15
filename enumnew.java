enum color{
    red,
    blue,
    green,
    black
}
// in using enum we does menstion any datatype name
public class enumnew {
    public static void main(String[] args) {
        color c1=color.red;
        System.out.println(c1);
        for (color c : color.values()) {
            System.out.println(c);
        }
    }
}
