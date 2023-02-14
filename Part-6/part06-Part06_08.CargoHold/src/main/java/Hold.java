
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> holdItems;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holdItems = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = this.totalWeight() + suitcase.totalWeight();
        if (weight <= this.maxWeight) {
            holdItems.add(suitcase);;
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase elems : holdItems) {
            totalWeight += elems.totalWeight();
        }
        return totalWeight;
    }
    public void printItems(){
        for (Suitcase elems: holdItems){
            elems.printItems();
        }  
    }

    @Override
    public String toString() {
        return holdItems.size() + " suitcases " + "(" + totalWeight() + "kg)";
    }

}
