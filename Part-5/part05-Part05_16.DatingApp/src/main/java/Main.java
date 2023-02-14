
public class Main {

    public static void main(String[] args) {
        SimpleDate test1 = new SimpleDate(1, 11, 2023);
        System.out.println(test1);
        test1.advance(64);
        System.out.println(test1);
    }
}
