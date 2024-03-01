package al.sdacademy.functional;

public enum AvailableCommand {
    ADD("add"),
    SUBTRACT("subtract"),
    MULTIPLY("multiply"),
    DIVIDE("divide"),
    EXIT("exit");
    
    private final String textValue;
    
    AvailableCommand(String textValue) {
        this.textValue = textValue;
    }
}
