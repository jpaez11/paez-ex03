package exercise03.solution03;
import java.util.Scanner;

public class solution03 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the quote?");
        String quote = myObj.nextLine();
        System.out.println("Who said it?");
        String who = myObj.nextLine();


        System.out.println(who + " says, \"" + quote + "\"" );
    }
}