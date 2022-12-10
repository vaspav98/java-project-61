package hexlet.code;
import hexlet.code.games.*;
import java.util.Scanner;

public class Engine {
    public static int round = 1;

    public static String getAnswer(int num) {
        switch (num) {
            case 2:
                return Even.answer;
            case 3:
                return Calc.answer;
            case 4:
                return GCD.answer;
            case 5:
                return Progression.answer;
            default:
                return Prime.answer;
        }
    }

    public static String getRightAnswer(int num) {
        switch (num) {
            case 2:
                return Even.rightAnswer;
            case 3:
                return Calc.rightAnswer;
            case 4:
                return GCD.rightAnswer;
            case 5:
                return Progression.rightAnswer;
            default:
                return Prime.rightAnswer;
        }
    }

    public static void launchGame(int num) {
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        final var numberOfAttempts = 3;

        while (round <= numberOfAttempts) {
            switch (num) {
                case 2:
                    Even.game();
                    break;
                case 3:
                    Calc.game();
                    break;
                case 4:
                    GCD.game();
                    break;
                case 5:
                    Progression.game();
                    break;
                default:
                    Prime.game();
            }

            if (getAnswer(num).equals(getRightAnswer(num))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + getAnswer(num) + "' is wrong answer ;(. "
                        + "Correct answer was '" + getRightAnswer(num) + "'.");
                System.out.println("Let's try again, " + userName);
                break;
            }
            if (round == 3) {
                System.out.println("Congratulations, " + userName + "!");
            }
            round++;
        }
    }
}

