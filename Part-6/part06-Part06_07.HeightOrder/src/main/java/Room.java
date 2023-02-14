
import java.util.ArrayList;


public class Room {
    private ArrayList<Person> peopleInRoom;
    
    public Room(){
        this.peopleInRoom = new ArrayList<>(); 
    }
    
    public void add(Person person){
        this.peopleInRoom.add(person);
    }
    public boolean isEmpty(){
        return this.peopleInRoom.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.peopleInRoom;
    }
    
    public Person shortest(){
        
        if (peopleInRoom.isEmpty()){
            return null;
        }
        
        Person shortestPerson = this.peopleInRoom.get(0);
        for (Person elem: peopleInRoom){
            if (elem.getHeight() < shortestPerson.getHeight()){
                shortestPerson = elem;
            }
        }
        return shortestPerson;
    }
    public Person take(){
        Person shortestPerson = shortest();
        this.peopleInRoom.remove(shortestPerson);
        return shortestPerson;
    }
}


