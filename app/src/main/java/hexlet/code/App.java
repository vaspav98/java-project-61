package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        var answer = scanner.next();
        if (answer.equals("1")) {
            Cli.greeting();
        } else if (answer.equals("2")) {
            Engine.launchGame(2);
        } else if (answer.equals("3")) {
            Engine.launchGame(3);
        }
    }
}
