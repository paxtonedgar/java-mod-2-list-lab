import java.util.LinkedList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String res = "no";
        Scanner sc = new Scanner(System.in);
        userInput(res, sc);
    }

    public static void userInput(String res, Scanner sc){

        Library lib = new Library();  
        System.out.println("Welcome to the Libraries Book entry!");
        System.out.println();
        System.out.println("Would you like to make an entry?");


        res = sc.nextLine(); 
        res = res.trim().toLowerCase().toString(); 

        while(res.matches("^y(e)?(s)?$")){
            Book newBook = new Book(); 
            LinkedList<Object> bookEntry = newBook.create(sc, res); 
            lib.addCatalog(bookEntry);
            res = inputCont(sc, res); 
        } 
        if(res.matches("^n(o)?$")){
            System.out.println();
            System.out.println("GoodBye!");
        }
    }

    public static String inputCont(Scanner sc, String res){
        System.out.println("Would you like to make another entry?");
        res = sc.nextLine();
        System.out.println(); 
        res = res.trim().toLowerCase().toString(); 
        return res; 
    }


}
