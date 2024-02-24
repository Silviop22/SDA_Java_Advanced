package al.sdacademy.collections.map.hashmap;

import al.sdacademy.collections.map.hashmap.repository.StudentGradeBook;

public class Main {
    public static void main(String[] args) {
        StudentGradeBook gradebook = new StudentGradeBook();
        gradebook.add("John", 85.0);
        gradebook.add("Jane", 90.0);
        
        Double johnGrade = gradebook.get("John");
        System.out.println("John's grade: " + johnGrade);  // output: John's grade: 85.0
        
        gradebook.add("John", 95.0);
        johnGrade = gradebook.get("John");
        System.out.println("New John's grade: " + johnGrade);  // output: New John's grade: 95.0
        
        System.out.println("Gradebook size: " + gradebook.getSize());  // output: Gradebook size: 2
        
        gradebook.remove("Jane");
        System.out.println("Gradebook size: " + gradebook.getSize());  // output: Gradebook size: 1
    }
}