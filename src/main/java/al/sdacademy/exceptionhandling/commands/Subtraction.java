package al.sdacademy.exceptionhandling.commands;

public class Subtraction implements Command {
    private final int firstOperand;
    private final int secondOperand;
    
    public Subtraction(int firstOperand, int secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
    
    @Override
    public int execute() {
        return firstOperand - secondOperand;
    }
}
