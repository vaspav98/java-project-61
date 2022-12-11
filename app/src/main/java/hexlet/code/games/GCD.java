package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class GCD {
    public static String rightAnswer = "";
    public static String answer = "";

    public static void game() {
        if (Engine.round == 1) {
            System.out.println("Find the greatest common divisor of given numbers.");
        }
        final var scatter = 101;
        var a = (int) (Math.random() * scatter);
        var b = (int) (Math.random() * scatter);
        System.out.println("Question: " + a + " " + b);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();
        var lesserNum = Math.min(a, b);
        for (var i = lesserNum; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                rightAnswer = Integer.toString(i);
                break;
            }
        }
    }
}
