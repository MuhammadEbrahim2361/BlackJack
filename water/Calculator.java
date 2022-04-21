import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double oper1 = 0;
        double oper2 = 0;
        double result;
        int options;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter first operand: ");
        oper1 = Integer.parseInt(scnr.next());
        System.out.print("Enter second operand: ");
        oper2 = scnr.nextDouble();

        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");  // calculating menu


        System.out.println("Which operation do you want to perform? ");
        options = scnr.nextInt(); // scanner for opt variable
        if (options == 1) {
            result = oper1 + oper2;
            System.out.println("The result of the operation is " + result + ". Goodbye!");
        } // creates Add

        if(options == 2) {
            result = oper1 - oper2;
            System.out.println("The result of the operation is " + result + ". Goodbye!");
        }// creates substract

        if(options == 3) {
            result = oper1 * oper2;
            System.out.println("The result of the operation is " + result + ". Goodbye!");
        }// creates Multiply

        if(options == 4) {
            result = oper1 / oper2;
            System.out.println("The result of the operation is " + result + ". Goodbye!");
        } // creates divide

        if(options > 4 || options < 1) {
            System.out.println("Error: Invalid selection! Terminating program.");

        }

    }
}
