package al.sdacademy.exceptionhandling.commands;

public class ExitCommand implements Command {
    @Override
    public int execute() {
        System.out.println("Exiting the program");
        System.exit(0);
        return 0;
    }
}
