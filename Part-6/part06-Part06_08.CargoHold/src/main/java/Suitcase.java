
import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private String name;
    private ArrayList<Item> suitcaseItems;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcaseItems = new ArrayList<>();
    }

    public void addItem(Item item) {
        suitcaseItems.add(item);
        if (this.totalWeight() > this.maxWeight) {
            suitcaseItems.remove(item);
        }

    }

    public void printItems() {
        for (Item elems : suitcaseItems) {
            System.out.println(elems);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item elems : suitcaseItems) {
            totalWeight += elems.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (suitcaseItems.isEmpty()) {
            return null;
        }
        Item heaviestItem = suitcaseItems.get(0);
        for (Item elems : suitcaseItems) {
            if (elems.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = elems;
            }
        }
        return heaviestItem;
    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for (Item elems : suitcaseItems) {
            totalWeight += elems.getWeight();
            if (totalWeight > maxWeight) {
                suitcaseItems.remove(suitcaseItems.size() - 1);
                totalWeight -= (elems.getWeight());
                break;
            }
        }
        String outputString = " ";
        if (suitcaseItems.isEmpty()) {
            outputString = "no items";
        } else if (suitcaseItems.size() == 1) {
            outputString = "1 item";
        } else {
            outputString = suitcaseItems.size() + " items";
        }
        return outputString + "(" + totalWeight + "kg)";
    }

}
