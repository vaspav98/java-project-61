package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final String CONDITION = "Find the greatest common divisor of given numbers.";

    public static void game() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var a = Utils.generateNumber(MIN, MAX);
            var b = Utils.generateNumber(MIN, MAX);
            var question = a + " " + b;
            var rightAnswer = Integer.toString(gcd(a, b));
            gameData[i] = new String[] {question, rightAnswer};
        }
        Engine.launch(CONDITION, gameData);
    }

    public static int gcd(int a, int b) {
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
