package al.sdacademy.functional.command;

@FunctionalInterface
public interface Command {
    int execute(int a, int b);
}
