package al.sdacademy.functional.lambda;

import al.sdacademy.functional.lambda.AvailableCommand;
import al.sdacademy.functional.lambda.CommandFactory;
import al.sdacademy.functional.lambda.command.Command;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        
        while (true) {
            AvailableCommand command = getCommand();
            if (AvailableCommand.EXIT.equals(command)) {
                Command calculatorCommand = CommandFactory.getCommand(command);
                calculatorCommand.execute(0, 0);
                break;
            }
            int firstOperand = getNumberInput("Enter first number:");
            int secondOperand = getNumberInput("Enter second number:");
            try {
                calculate(command, firstOperand, secondOperand);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero. Please try again.");
            } catch (RuntimeException e) {
                System.out.println("Something went wrong. Please try again.");
            }
            
            SCANNER.nextLine();
        }
        SCANNER.close();
    }
    
    private static AvailableCommand getCommand() {
        System.out.println("Enter operation (ADD, SUBTRACT, MULTIPLY, DIVIDE or 'exit' to quit):");
        String input = SCANNER.nextLine();
        try {
            return AvailableCommand.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation. Please Enter one of the following  (ADD, SUBTRACT, MULTIPLY, DIVIDE or 'exit' to quit).");
            SCANNER.nextLine();
            return getCommand();
        }
    }
    
    private static void calculate(AvailableCommand command, int firstOperand, int secondOperand) {
        Command calculatorCommand = CommandFactory.getCommand(command);
        System.out.println("Result: " + calculatorCommand.execute(firstOperand, secondOperand));
    }
    
    private static int getNumberInput(String prompt) {
        System.out.println(prompt);
        try {
            return SCANNER.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            SCANNER.nextLine();
            return getNumberInput(prompt);
        }
    }
}
