import java.util.ArrayList;
import java.util.LinkedList;

public class Library {
    ArrayList<LinkedList<Object>> catalog = new ArrayList<LinkedList<Object>>();

    public ArrayList<LinkedList<Object>> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<LinkedList<Object>> catalog) {
        this.catalog = catalog;
    }

    public void addCatalog(LinkedList<Object> bookEntry) {
        this.catalog.add(bookEntry); 
    } 

    
}
