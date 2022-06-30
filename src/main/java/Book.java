import java.util.LinkedList;
import java.util.Scanner;

public class Book extends Library {
    String Title; 
    String Genre; 
    int pageCount; 


    public LinkedList<Object> create(Scanner sc, String res){
        LinkedList<Object> entry = new LinkedList<>(); 
        System.out.println("Title?");
        Title = sc.nextLine(); 
        System.out.println();

        System.out.println("Genre?");
        Genre = sc.nextLine();
        System.out.println();

        System.out.println("How many pages are in the book?");
        pageCount = sc.nextInt();
        System.out.println();
        res = sc.nextLine();
        
        entry.add(0, Title); 
        entry.add(1, Genre); 
        entry.add(2, pageCount); 

        return entry; 
    }
}
