package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class Calc {
    public static String rightAnswer = "";
    public static String answer = "";

    public static void game() {
        if (Engine.round == 1) {
            System.out.println("What is the result of the expression?");
        }
        char[] array = {'+', '-', '*'};
        char operator = array[(int) (Math.random() * array.length)];
        final var scatter = 100;
        final var scatterForMult = 20;
        var a = (int) (Math.random() * scatter);
        var b = (int) (Math.random() * scatter);
        if (operator == '*') {
            a = (int) (Math.random() * scatterForMult);
            b = (int) (Math.random() * scatterForMult);
        }
        System.out.println("Question: " + a + " " + operator + " " + b);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();
        if (operator == '+') {
            rightAnswer = Integer.toString(a + b);
        } else if (operator == '-') {
            rightAnswer = Integer.toString(a - b);
        } else {
            rightAnswer = Integer.toString(a * b);
        }
    }
}
