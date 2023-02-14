import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;
    
    public Package(){
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    public int totalWeight(){
        int totalWeightGifts = 0;
        for (Gift items: gifts) {
            totalWeightGifts += items.getWeight();
        }
        return totalWeightGifts;
    }
}
