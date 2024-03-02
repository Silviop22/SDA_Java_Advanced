package al.sdacademy.functional.lambda;

import al.sdacademy.functional.lambda.AvailableCommand;
import al.sdacademy.functional.lambda.command.Command;

public class CommandFactory {
    public static Command getCommand(AvailableCommand operator) {
       
        return switch (operator) {
            case ADD -> (a, b) -> a + b;
            case SUBTRACT -> (a, b) -> a - b;
            case MULTIPLY -> (a, b) -> a * b ;
            case DIVIDE -> (a, b) -> a / b ;
            case EXIT -> (a, b) -> 0;
        };
    }
}
