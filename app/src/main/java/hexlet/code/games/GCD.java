package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void game() {
        String condition = "Find the greatest common divisor of given numbers.";
        Engine.start(condition);
        final var min = 1;
        final var max = 100;
        for (var i = 1; i <= Engine.ROUNDS_COUNT; i++) {
            var a = Utils.generateNumber(min, max);
            var b = Utils.generateNumber(min, max);
            var question = a + " " + b;
            var rightAnswer = Integer.toString(calculationGCD(a, b));
            var check = Engine.continuation(question, rightAnswer);
            if (!check) {
                break;
            }
            if (i == Engine.ROUNDS_COUNT) {
                Engine.end();
            }
        }
    }

    public static int calculationGCD(int a, int b) {
        var lesserNum = Math.min(a, b);
        var result = 0;
        for (var i = lesserNum; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                result  = i;
                break;
            }
        }
        return result;
    }
}
