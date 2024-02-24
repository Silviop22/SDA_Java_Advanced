package al.sdacademy.util;

import java.util.function.Supplier;

public class TimerDecorator {
    
    public static <T> T execute(Supplier<T> supplier) {
        long startTime = System.nanoTime();
        T result = supplier.get();
        long endTime = System.nanoTime();
        
        long duration = endTime - startTime; // time in nanoseconds
        System.out.println("Execution time: " + duration + " nanoseconds");
        
        return result;
    }
}