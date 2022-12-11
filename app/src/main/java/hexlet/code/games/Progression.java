package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class Progression {
    public static String rightAnswer = "";
    public static String answer = "";

    public static void game() {
        if (Engine.round == 1) {
            System.out.println("What number is missing in the progression?");
        }
        final var progressionLength = 9;
        final var scatter = 100;
        var progression = "";
        var num = (int) (Math.random() * scatter);
        var diff = (int) (Math.random() * progressionLength + 1);
        var skip = (int) (Math.random() * progressionLength + 1);
        for (var i = 1; i <= progressionLength; i++) {
            if (skip == i) {
                progression += ".. ";
                rightAnswer = Integer.toString(num);
                num += diff;
            }
            progression += num + " ";
            num += diff;
        }
        System.out.println("Question: " + progression);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();
    }
}
