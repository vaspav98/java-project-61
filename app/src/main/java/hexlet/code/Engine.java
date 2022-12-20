package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    private static String userName  = "";

    public static void start(String condition) {
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(condition);
    }

    public static boolean continuation(String question, String rightAnswer) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        var answer = scanner.next();
        if (answer.equals(rightAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. "
                    + "Correct answer was '" + rightAnswer + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
    }

    public static void end() {
        System.out.println("Congratulations, " + userName + "!");
    }
}
