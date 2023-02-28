package lab01_02;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class lab {
    public static <T> void main(String[] args) {
        HashMap <String, Double> operators = new HashMap <String, Double>();
        String var;
        String operator;
        Double val;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.length() == 0) {
                System.err.println("Invalid input - empty string");
                System.exit(0);

            } else if (input.length() == 1){
                operators.put(input, 0.0);

            } else if (input.split(" ").length == 3){
                if (!(operators.containsKey(input.split(" ")[0] ) || operators.containsKey(input.split(" ")[2]))){
                    System.err.println("Invalid input - unknown variable");
                    System.exit(0);
                }
                operator = input.split(" ")[1];
                if (operators.containsKey(input.split(" ")[0] ) && operators.containsKey(input.split(" ")[2])){
                    switch (operator) {
                        case "+":
                            System.out.println(operators.get(input.split(" ")[0]) + operators.get(input.split(" ")[2]));
                            break;
                        case "-":
                            System.out.println(operators.get(input.split(" ")[0]) - operators.get(input.split(" ")[2]));
                            break;
                        case "*":
                            System.out.println(operators.get(input.split(" ")[0]) * operators.get(input.split(" ")[2]));
                            break;
                        case "/":
                            System.out.println(operators.get(input.split(" ")[0]) / operators.get(input.split(" ")[2]));
                            break;
                        case "=":
                            operators.put(input.split(" ")[0], operators.get(input.split(" ")[2]));
                            break;
                        default:
                            break;
                    }
                    continue;
                }

                var = input.split(" ")[0];
                val = Double.parseDouble(input.split(" ")[2]);
                switch (operator) {
                    case "+":
                        operators.put(input.split(" ")[0], operators.get(input.split(" ")[0]) + val);
                        break;
                    case "-":
                        operators.put(input.split(" ")[0], operators.get(input.split(" ")[0]) - val);
                        break;
                    case "*":
                        operators.put(input.split(" ")[0], operators.get(input.split(" ")[0]) * val);
                        break;
                    case "/":
                        operators.put(input.split(" ")[0], operators.get(input.split(" ")[0]) / val);
                        break;
                    case "=":
                        operators.put(input.split(" ")[0], val);
                        break;
                    default:
                        break;
                }
            } else {
                System.err.println("Invalid input - wrong number of arguments");
                System.exit(0);
            }

            System.out.println(operators);
        }

    }
}