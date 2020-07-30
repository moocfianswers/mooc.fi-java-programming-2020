
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if(this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        if(this.elements.size() == 1) {
            return "The collection " + this.name + " has 1 element:\n" + this.elements.get(0);
        }
        
        String printedSet = "";
        for (String element : elements) {
            printedSet += "\n" + element;
        }
        
        return "The collection " + this.name + " has " + this.elements.size() + " elements:" + printedSet;
    }
}
