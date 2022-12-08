package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        var answer = scanner.next();
        if (answer.equals("1")) {
            Cli.greeting();
        }
        if (answer.equals("2")) {
            Even.game();
        }
    }
}
