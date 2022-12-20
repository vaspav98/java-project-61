package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static String rightAnswer = "";
    public static void game() {
        String condition = "What number is missing in the progression?";
        Engine.start(condition);
        final var min = 0;
        final var max = 100;
        final var maxForDiff = 10;
        final var progressionLength = 10;
        for (var i = 1; i <= Engine.ROUNDS_COUNT; i++) {
            var question = createProgression(min, max, maxForDiff, progressionLength);
            var check = Engine.continuation(question, rightAnswer);
            if (!check) {
                break;
            }
            if (i == Engine.ROUNDS_COUNT) {
                Engine.end();
            }
        }
    }

    public static String createProgression(int min, int max, int maxForDiff, int progressionLength) {
        String[] progression = new String[progressionLength];
        var number = Utils.generateNumber(min, max);
        var diff = Utils.generateNumber(1, maxForDiff);
        var skip = Utils.generateNumber(0, progressionLength - 1);
        for (var i = 0; i < progression.length; i++) {
            if (skip == i) {
                progression[i] = "..";
                rightAnswer = Integer.toString(number);
            } else {
                progression[i] = Integer.toString(number);
            }
            number += diff;
        }
        return String.join(" ", progression);
    }
}
