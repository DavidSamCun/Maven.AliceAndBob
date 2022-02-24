import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        String name;
        String Alice = "Alice";
        String alice = "alice";
        String Bob = "Bob";
        String bob = "bob";

        Scanner in = new Scanner(System.in);

        System.out.print("Who are you? What's ya name? ");
        name = in.nextLine();

        if (name.equals(Alice)){
            System.out.println("Hi Alice.");
        } else if (name.equals(alice)){
            System.out.println("Hi Alice. Please capitalize your name");
        } else if (name.equals(Bob)){
            System.out.println("Hi Bob.");
        } else if (name.equals(bob)){
            System.out.println(("Hi Bob. Please capitalize your name."));
        } else {
            System.out.println(("Who you?"));
        }


    }
}
