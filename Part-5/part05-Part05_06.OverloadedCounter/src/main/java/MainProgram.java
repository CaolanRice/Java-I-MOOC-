
public class MainProgram {

    public static void main(String[] args) {
        Counter first = new Counter(10);
        Counter second = new Counter();
        
        System.out.println(first.value());
        System.out.println(second.value());
    }
}
