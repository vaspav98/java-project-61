package hexlet.code;
import java.util.Scanner;

public class Even {
    public static void game() {
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        final var numberOfAttempts = 3;

        for (var i = 1; i <= numberOfAttempts; i++) {
            var number = (int) (Math.random() * 100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            var answer = scanner.next();
            if ((number % 2 == 0 && answer.equals("yes")) || (number % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
            } else if (number % 2 == 0) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, "  + userName);
                break;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + userName);
                break;
            }
            if (i == 3) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
