package al.sdacademy.functional.lambda.command;

@FunctionalInterface
public interface Command {
    int execute(int a, int b);
}
