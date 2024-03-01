package al.sdacademy.functional;

import al.sdacademy.functional.command.Command;

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
