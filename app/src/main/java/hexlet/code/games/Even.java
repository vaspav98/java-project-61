package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void game() {
        String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.start(condition);
        final var min = 1;
        final var max = 100;
        for (var i = 1; i <= Engine.ROUNDS_COUNT; i++) {
            var number = Utils.generateNumber(min, max);
            var question = Integer.toString(number);
            var rightAnswer = number % 2 == 0 ? "yes" : "no";
            boolean check = Engine.continuation(question, rightAnswer);
            if (!check) {
                break;
            }
            if (i == Engine.ROUNDS_COUNT) {
                Engine.end();
            }
        }
    }
}
