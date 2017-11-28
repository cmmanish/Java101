import java.util.Stack;

/**
 * Created by skloaner on 10/21/17.
 */

public class ExpressionEvaluation {

    private static int EvaluateString(String expression) {

        char[] tokens = expression.toCharArray();
        Stack<Integer> values = new Stack();
        Stack<Character> operators = new Stack();

        for (int i = 0; i < tokens.length; i++) {

            char item = tokens[i];
            if (item == ' ')
                continue;
            if (item >= '0' && item <= '9') {
                StringBuffer sbuf = new StringBuffer();
                while (i < tokens.length && tokens[i] > '0' && tokens[i] < '9') {
                    sbuf.append(tokens[i++]);
                    values.push(Integer.parseInt(sbuf.toString()));
                }
            } else if (item == '(') {
                operators.push(item);
            } else if (item == ')') {
                while (operators.peek() != '(') {
                    int val = applyops(operators.pop(), values.pop(), values.pop());
                    System.out.println(val);
                    values.push(val);
                }
            } else if (item == '+' || item == '-' || item == '*' || item == '/') {
                operators.push(item);
            }
        }
        return 1;
    }

    private static int applyops(char op, int a, int b) {

        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;

        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(EvaluateString("100 * ( 2 + 12 ) / 14"));
    }
}
