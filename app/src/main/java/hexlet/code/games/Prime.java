package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MIN = -1;
    private static final int MAX = 100;
    private static final String CONDITION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void game() {
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] rightAnswers = new String[Engine.ROUNDS_COUNT];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var number = Utils.generateNumber(MIN, MAX);
            questions[i] = Integer.toString(number);
            rightAnswers[i] = isPrime(number) ? "yes" : "no";
        }
        Engine.launch(CONDITION, questions, rightAnswers);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else {
            for (var divider = num - 1; divider > 1; divider--) {
                if (num % divider == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
