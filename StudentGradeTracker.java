package gradeTracker;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        
        System.out.println("=== Student Grade Tracker ===");
        
        while (true) {
            System.out.print("Enter a grade (or -1 to stop): ");
            int grade = scanner.nextInt();
            
            if (grade == -1) break; // exit condition
            
            if (grade >= 0 && grade <= 100) {
                grades.add(grade);
            } else {
                System.out.println("⚠ Invalid grade! Please enter between 0 and 100.");
            }
        }
        
        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            // Calculate statistics
            int total = 0, highest = grades.get(0), lowest = grades.get(0);
            
            for (int g : grades) {
                total += g;
                if (g > highest) highest = g;
                if (g < lowest) lowest = g;
            }
            
            double average = (double) total / grades.size();
            
            // Display report
            System.out.println("\n=== Grade Summary Report ===");
            System.out.println("Grades: " + grades);
            System.out.println("Average: " + average);
            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);
        }
        
        scanner.close();
    }
}