package lab01_01;



public class lab {
    public static void main(String[] args) {

        try {
            Double inputOne = Double.parseDouble(args[0].split(" ")[0]);
            String operator = args[0].split(" ")[1];
            Double inputTwo = Double.parseDouble(args[0].split(" ")[2]);

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

        } catch (Exception e) {
            System.err.println("Invalid input");
        }
    }
}