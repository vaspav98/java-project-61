package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final String CONDITION = "What is the result of the expression?";

    public static void game() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            char operator = OPERATORS[Utils.generateNumber(0, OPERATORS.length - 1)];
            var a = Utils.generateNumber(MIN, MAX);
            var b = Utils.generateNumber(MIN, MAX);
            var question = a + " " + operator + " " + b;
            var rightAnswer = Integer.toString(calculate(operator, a, b));
            gameData[i] = new String[] {question, rightAnswer};
        }
        Engine.launch(CONDITION, gameData);
    }

    public static int calculate(char operator, int a, int b) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                throw new RuntimeException("Unknown input: " + operator);
        }
    }
}
