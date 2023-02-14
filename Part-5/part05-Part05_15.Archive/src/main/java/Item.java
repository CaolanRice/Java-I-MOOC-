
import java.util.Objects;

public class Item {
    String identifier;
    String name;

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Item)) {
            return false;
        }
        Item comparedItem = (Item) compared;
        if (this.identifier.equals(comparedItem.identifier)){
        return true;
    }
        return false;
    }

    @Override
    public String toString() {
        return identifier + ": " + name;
    }

    Item(String i, String n){
        this.identifier = i;
        this.name = n;

    }
}