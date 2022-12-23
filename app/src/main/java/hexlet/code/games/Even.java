package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final String CONDITION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void game() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var number = Utils.generateNumber(MIN, MAX);
            var question = Integer.toString(number);
            var rightAnswer = isEven(number) ? "yes" : "no";
            gameData[i] = new String[] {question, rightAnswer};
        }
        Engine.launch(CONDITION, gameData);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
