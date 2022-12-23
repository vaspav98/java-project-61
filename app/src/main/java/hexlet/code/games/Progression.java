package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final int MAX_FOR_STEP = 10;
    private static final int PROGRESSION_LENGTH = 10;
    private static final String CONDITION = "What number is missing in the progression?";

    public static void game() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var firstNum = Utils.generateNumber(MIN, MAX);
            var step = Utils.generateNumber(1, MAX_FOR_STEP);
            var hiddenIndex = Utils.generateNumber(0, PROGRESSION_LENGTH - 1);
            String[] progression = createProgression(firstNum, step, PROGRESSION_LENGTH);
            var rightAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            var question = String.join(" ", progression);
            gameData[i] = new String[] {question, rightAnswer};
        }
        Engine.launch(CONDITION, gameData);
    }

    public static String[] createProgression(int number, int step, int progressionLength) {
        String[] progression = new String[progressionLength];
        for (var i = 0; i < progression.length; i++) {
            progression[i] = Integer.toString(number);
            number += step;
        }
        return progression;
    }
}
