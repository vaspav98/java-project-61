package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void game() {
        String condition = "What is the result of the expression?";
        Engine.start(condition);
        final var min = 0;
        final var max = 100;
        final var maxForMult = 20;
        char[] array = {'+', '-', '*'};
        for (var i = 1; i <= Engine.ROUNDS_COUNT; i++) {
            char operator = array[(int) (Math.random() * array.length)];
            var a = Utils.generateNumber(min, max);
            var b = Utils.generateNumber(min, max);
            if (operator == '*') {
                a = Utils.generateNumber(min, maxForMult);
                b = Utils.generateNumber(min, maxForMult);
            }
            var question = a + " " + operator + " " + b;
            var rightAnswer = "";
            if (operator == '+') {
                rightAnswer = Integer.toString(a + b);
            } else if (operator == '-') {
                rightAnswer = Integer.toString(a - b);
            } else {
                rightAnswer = Integer.toString(a * b);
            }
            var check = Engine.continuation(question, rightAnswer);
            if (!check) {
                break;
            }
            if (i == Engine.ROUNDS_COUNT) {
                Engine.end();
            }
        }
    }
}
