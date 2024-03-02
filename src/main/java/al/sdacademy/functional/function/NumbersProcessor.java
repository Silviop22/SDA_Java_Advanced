package al.sdacademy.functional.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersProcessor {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Without using Function Interface
        List<Integer> doubledNumbers = doubleNumbers(numbers);
        List<Integer> halveNumbers = halvenNumbers(numbers);
        List<Integer> squareNumbers = squareNumbers(numbers);
        List<Integer> incrementNumber = incrementNumber(numbers);

        // Print the result
        System.out.println("Doubled Numbers: " + doubledNumbers);
        System.out.println("Halve Numbers: " + halveNumbers);
        System.out.println("Square Numbers: " + squareNumbers);
        System.out.println("Increment Numbers: " + incrementNumber);
    }

    // Without using Function Interface
    private static List<Integer> doubleNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            result.add(number * 2);
        }

        return result;
    }

    private static List<Integer> halvenNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            result.add(number / 2);
        }

        return result;
    }

    private static List<Integer> squareNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            result.add(number * number);
        }

        return result;
    }

    private static List<Integer> incrementNumber(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            result.add(number + 1);
        }

        return result;
    }
}
