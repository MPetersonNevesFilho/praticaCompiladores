package lab01_01;



public class lab01a {
    public static void main(String[] args) {

        Integer inputOne = args[0].charAt(0) - '0';
        String operator = args[0].charAt(2) + "";
        Integer inputTwo = args[0].charAt(4) - '0';

        if (operator.equals("+")) {
            System.out.println(inputOne + inputTwo);
        }
        else if (operator.equals("-")) {
            System.out.println(inputOne - inputTwo);
        }
        else if (operator.equals("*")) {
            System.out.println(inputOne * inputTwo);
        }
        else if (operator.equals("/")) {
            System.out.println(inputOne / inputTwo);
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}