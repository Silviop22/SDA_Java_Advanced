package al.sdacademy.exceptionhandling.commands;

public class Divsion implements Command {
    private final int firstOperand;
    private final int secondOperand;
    
    public Divsion(int firstOperand, int secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
    
    @Override
    public int execute() {
        return firstOperand / secondOperand;
    }
}
