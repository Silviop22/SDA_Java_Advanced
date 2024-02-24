package al.sdacademy.collections.set.treeset;

import java.util.TreeSet;

public class Main {
    /* Given a sorted array of distinct integers and a target number,
    write a function that returns the number in the array
    that is closest to the target.
    **/
    public static void main(String[] args) {
    
    }
    
    public int findClosest(int[] numbers, int target){
        int start = 0;
        int end = numbers.length - 1;
        
        while(start < end) {
            int mid = start + (end - start) / 2;
            
            if (numbers[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        
        // At this point 'start' should refer to the smallest integer greater than or equal to target
        // Check if start > 0 and then only decide whether to return start or start - 1.
        // Else start would be pointing to first element, return it
        return isFirstClosest(numbers, target, start) ? numbers[start - 1]
                       : numbers[start];
    }
    
    private static boolean isFirstClosest(int[] numbers, int target, int start) {
        return (start > 0 && (numbers[start] - target >= target - numbers[start - 1]));
    }
    
    public Integer findClosestUsingTreeSet(int[] numbers, int target) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : numbers) {
            set.add(num);
        }
        
        Integer floor = set.floor(target);
        Integer ceiling = set.ceiling(target);
        
        if (floor == null) {
            return ceiling;
        } else if (ceiling == null){
            return floor;
        } else {
            return (ceiling - target < target - floor) ? ceiling : floor;
        }
    }
}
