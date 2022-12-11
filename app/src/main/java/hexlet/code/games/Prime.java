package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class Prime {
    public static String rightAnswer = "";
    public static String answer = "";

    public static void game() {
        if (Engine.round == 1) {
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        }
        final var scatter = 100;
        var num = (int) (Math.random() * scatter + 1);
        System.out.println("Question: " + num);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();
        if (num == 1) {
            rightAnswer = "no";
        } else if (num == 2) {
            rightAnswer = "yes";
        }
        for (var divider = num - 1; divider > 1; divider--) {
            if (num % divider == 0) {
                rightAnswer = "no";
                break;
            }
            rightAnswer = "yes";
        }
    }
}
