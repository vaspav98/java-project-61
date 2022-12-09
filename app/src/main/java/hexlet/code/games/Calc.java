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
        var a = (int) (Math.random() * 100);
        var b = (int) (Math.random() * 100);
        if (operator == '*') {
            a = (int) (Math.random() * 20);
            b = (int) (Math.random() * 20);
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
