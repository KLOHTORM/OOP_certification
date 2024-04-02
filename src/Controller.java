import java.util.Stack;

public class Controller {
    public static void main(String[] args) {
        String input = View.getResult();
        int result = calculate(input);
        View.presentResult(result);
    }

    public static int calculate(String input) {
        String[] tokens = input.split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.matches("[0-9]+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int secondNumber = stack.pop();
                int firstNumber = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(Model.addition(firstNumber, secondNumber));
                        break;
                    case "-":
                        stack.push(Model.substraction(firstNumber, secondNumber));
                        break;
                    case "*":
                        stack.push(Model.multiplication(firstNumber, secondNumber));
                        break;
                    case "/":
                        stack.push(Model.division(firstNumber, secondNumber));
                        break;

                }
            }
        }
        return stack.pop();
    }
}
