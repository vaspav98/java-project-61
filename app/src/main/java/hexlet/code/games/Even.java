package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class Even {
    public static String rightAnswer = "";
    public static String answer = "";

    public static void game() {
        if (Engine.round == 1) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        }
        var number = (int) (Math.random() * 100);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();
        if (number % 2 == 0) {
            rightAnswer = "yes";
        } else {
            rightAnswer = "no";
        }
    }
}
