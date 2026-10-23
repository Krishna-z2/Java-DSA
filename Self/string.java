import java.util.Scanner;

public class string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String Initialization:-
        String firstname = "Raiden";
        String lastname = new String("Shogun");

        System.out.println(firstname + " " + lastname);

        // Indexing:-
        System.out.println(firstname.length());  // 6
        System.out.println(lastname.charAt(0));  // S

        
    }
}