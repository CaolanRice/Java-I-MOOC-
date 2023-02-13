
public class Statistics {

    private int count;
    private int total;

    public Statistics() {
        this.count = 0;
        this.total = 0;
        
    }

    public void addNumber(int number) {
        this.count+= 1;
        this.total += number;
    }

    public int getCount() {
        return this.count;
    }
    public int sum(){
        return total;
    }
    public double average(){
        return 1.0 * this.total / this.count;
    }
    
}
