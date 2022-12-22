package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void launch(String condition, String[] questions, String[] rightAnswers) {
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(condition);
        for (var i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            var answer = scanner.next();
            if (answer.equals(rightAnswers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + rightAnswers[i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            if (i == Engine.ROUNDS_COUNT - 1) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
