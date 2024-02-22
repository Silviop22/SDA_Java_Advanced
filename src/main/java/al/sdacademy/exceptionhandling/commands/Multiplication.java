package al.sdacademy.exceptionhandling.commands;

public class Multiplication implements Command {
    
    private final int firstOperand;
    private final int secondOperand;
    @Override
    public int execute() {
        return firstOperand * secondOperand;
    }
    
    public Multiplication(int firstOperand, int secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
}
