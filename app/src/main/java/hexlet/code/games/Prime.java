package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void game() {
        String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.start(condition);
        final var min = -1;
        final var max = 100;
        for (var i = 1; i <= Engine.ROUNDS_COUNT; i++) {
            var number = Utils.generateNumber(min, max);
            var question = Integer.toString(number);
            var rightAnswer = isPrime(number);
            var check = Engine.continuation(question, rightAnswer);
            if (!check) {
                break;
            }
            if (i == Engine.ROUNDS_COUNT) {
                Engine.end();
            }
        }
    }

    public static String isPrime(int num) {
        var result = "";
        if (num <= 1) {
            result = "no";
        } else if (num == 2) {
            result = "yes";
        }
        for (var divider = num - 1; divider > 1; divider--) {
            if (num % divider == 0) {
                result = "no";
                break;
            }
            result = "yes";
        }
        return result;
    }
}
