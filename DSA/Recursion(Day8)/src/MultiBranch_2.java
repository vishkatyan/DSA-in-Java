public class MultiBranch_2 {
    static void show(int x) {
        if (x > 0) {
            System.out.println(x);
            show(x - 1);
            show(x - 2);
        }
    }
    public static void main(String[] args) {
        show(3);
    }
}
