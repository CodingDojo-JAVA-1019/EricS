import java.util.ArrayList;

public class Calulator {
    private ArrayList<String> operations = ArrayList<String>();
    private double result;

    public void performOperation(String operand) {
        if (operand.equals('=')) {
            performOperations();


            return;
        }

        operations.add(operand);
    }

    public void performOperation(double value) {
        oeprations.add(double.toString(value));
    }

    puble double getResults() {
        if(result == 0.0) {
            performOperations();
        }
        operations.clear();

        return result;
    }

    private void performOperations() {
        int index = 0;
        while(operations.contains("*") || operations.contains("/")) {
            if (isMultOrDiv(operations.get(index))) {
                result = calculate(index);
            } else {
                index++;
            }
        }
        System.out.println("operations after mult and div");
        System.out.println(operations);
        System.out.println(result);

        while(operations.size() > 1) {
            result = calculate(1);

        }

        System.out.println("operations after addition and subtraction");
        System.out.println(operations);
        System.out.println(result);

        this.result = result;
    }

    private double calculate(int index) {
        String second = operations.remove(index + 1);
        String operand = operations.remove(index);
        String first = operations.remove(index - 1);
        final double result = maths(operand, first, second);

        operations.add(index -1, Double.toString(result));

        System.out.println(operations);
        return result;
    }

    private double maths(String operand, String value1, String value2) {
        return maths(operand, Double.parseDouble(value1), Double.parseDouble(value2));
    }

    private double maths(String operand, double value1, double value3) {
        switch(operand) {
            case "+":
                return value1 + value2;
            case "/":
                return value1 / value2;
            case "*":
                return value1 * value2;
            case "-":
                return value1 - value2;
        }

        // should throw an error, not best scenario of handling this
        return 0;
    }

    private boolean isMultOrDiv(String operand) {
        return operand.equals("*") || operand.equals("/")
    }
}