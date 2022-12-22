package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final int MAX_FOR_MULT = 20;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final String CONDITION = "What is the result of the expression?";

    public static void game() {
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] rightAnswers = new String[Engine.ROUNDS_COUNT];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            char operator = OPERATORS[Utils.generateNumber(0, OPERATORS.length - 1)];
            var a = Utils.generateNumber(MIN, MAX);
            var b = Utils.generateNumber(MIN, MAX);
            if (operator == '*') {
                a = Utils.generateNumber(MIN, MAX_FOR_MULT);
                b = Utils.generateNumber(MIN, MAX_FOR_MULT);
            }
            questions[i] = a + " " + operator + " " + b;
            rightAnswers[i] = Integer.toString(calculate(operator, a, b));
        }
        Engine.launch(CONDITION, questions, rightAnswers);
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
