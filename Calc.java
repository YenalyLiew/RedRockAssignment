import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个【数字】【符号】【数字】形式的计算式（如果符号后数字为负数，请加括号）：");
        String op = in.next().trim();

        String regex = "(\\()?-?[0-9]+(\\.[0-9]+)?(\\))?(\\+|\\-|\\*|\\/)(\\(-)?[0-9]+(\\.[0-9]+)?(\\))?";
        String regexPlus = "(\\()?-?[0-9]+(\\.[0-9]+)?(\\))?(\\+)(\\(-)?[0-9]+(\\.[0-9]+)?(\\))?";
        String regexMultiply = "(\\()?-?[0-9]+(\\.[0-9]+)?(\\))?(\\*)(\\(-)?[0-9]+(\\.[0-9]+)?(\\))?";
        String regexDivision = "(\\()?-?[0-9]+(\\.[0-9]+)?(\\))?/(\\(-)?[0-9]+(\\.[0-9]+)?(\\))?";
        String regexSubtraction = "(\\()?-?[0-9]+(\\.[0-9]+)?(\\))?(-)(\\(-)?[0-9]+(\\.[0-9]+)?(\\))?";

        if (!op.matches(regex)) throw new NumberFormatException("Input Incorrectly!");

        if (op.matches(regexPlus)) {
            op = op.replace("(", "")
                    .replace(")", "");
            String[] opList = op.split("\\+");
            double first = Double.parseDouble(opList[0]);
            double second = Double.parseDouble(opList[1]);
            System.out.printf("%.3f\n", first + second);
        }

        if (op.matches(regexMultiply)) {
            op = op.replace("(", "")
                    .replace(")", "");
            String[] opList = op.split("\\*");
            double first = Double.parseDouble(opList[0]);
            double second = Double.parseDouble(opList[1]);
            System.out.printf("%.3f\n", first * second);
        }

        if (op.matches(regexDivision)) {
            op = op.replace("(", "")
                    .replace(")", "");
            String[] opList = op.split("/");
            double first = Double.parseDouble(opList[0]);
            double second = Double.parseDouble(opList[1]);
            if (second == 0) throw new ArithmeticException("Cannot divided by ZERO!!!");
            System.out.printf("%.3f\n", first / second);
        }

        if (op.matches(regexSubtraction)) {
            op = op.replace("(", "")
                    .replace(")", "")
                    .replace("--", "+");
            if (op.matches(regexPlus)) {
                String[] opList = op.split("\\+");
                double first = Double.parseDouble(opList[0]);
                double second = Double.parseDouble(opList[1]);
                System.out.printf("%.3f\n", first + second);
            } else if (op.startsWith("-")) {
                String[] opList = op.split("-");
                double first = Double.parseDouble(opList[1]);
                double second = Double.parseDouble(opList[2]);
                System.out.printf("%.3f\n", -first - second);
            } else {
                String[] opList = op.split("-");
                double first = Double.parseDouble(opList[0]);
                double second = Double.parseDouble(opList[1]);
                System.out.printf("%.3f\n", first - second);
            }
        }
    }
}
