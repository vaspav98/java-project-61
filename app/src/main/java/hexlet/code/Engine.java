package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import java.util.Scanner;

public class Engine {
    public static int round = 1;
    public static void launchGame(int num) {
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        final var numberOfAttempts = 3;

        while (round <= numberOfAttempts) {
            if (num == 2) {
                Even.game();
                if (Even.answer.equals(Even.rightAnswer)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + Even.answer + "' is wrong answer ;(. "
                            + "Correct answer was '" + Even.rightAnswer + "'.");
                    System.out.println("Let's try again, " + userName);
                    break;
                }
            } else if (num == 3) {
                Calc.game();
                if (Calc.answer.equals(Calc.rightAnswer)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + Calc.answer + "' is wrong answer ;(. "
                            + "Correct answer was '" + Calc.rightAnswer + "'.");
                    System.out.println("Let's try again, "  + userName);
                    break;
                }
            }
            if (round == 3) {
                System.out.println("Congratulations, " + userName + "!");
            }
            round++;
        }
    }
}

