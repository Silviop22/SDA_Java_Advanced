package al.sdacademy.exceptionhandling;

import al.sdacademy.exceptionhandling.commands.Addition;
import al.sdacademy.exceptionhandling.commands.Command;
import al.sdacademy.exceptionhandling.commands.Divsion;
import al.sdacademy.exceptionhandling.commands.ExitCommand;
import al.sdacademy.exceptionhandling.commands.Multiplication;
import al.sdacademy.exceptionhandling.commands.Subtraction;

public class CommandFactory {
    public static Command getCommand(AvailableCommand operator, int firstOperand, int secondOperand) {
        return switch (operator) {
            case ADD  -> new Addition(firstOperand, secondOperand);
            case SUBTRACT -> new Subtraction(firstOperand, secondOperand);
            case MULTIPLY -> new Multiplication(firstOperand, secondOperand);
            case DIVIDE -> new Divsion(firstOperand, secondOperand);
            case EXIT -> new ExitCommand();
        };
    }
}
