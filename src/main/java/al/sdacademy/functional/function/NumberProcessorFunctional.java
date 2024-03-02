package al.sdacademy.functional.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;

public class NumberProcessorFunctional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> doubledNumbers = proccessNumbers(numbers, number -> number * 2);
        List<Integer> halveNumbers = proccessNumbers(numbers, number -> number / 2);
        List<Integer> squareNumbers = proccessNumbers(numbers, number -> number * number);
        List<Integer> incrementNumber = proccessNumbers(numbers, number -> number + 1);

        System.out.println("Doubled Numbers: " + doubledNumbers);
        System.out.println("Halve Numbers: " + halveNumbers);
        System.out.println("Square Numbers: " + squareNumbers);
        System.out.println("Increment Numbers: " + incrementNumber);

    }

    private static List<Integer> proccessNumbers(List<Integer> list, IntUnaryOperator function) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : list) {
            result.add(function.applyAsInt(number));
        }
        return result;
    }
}
