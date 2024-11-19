/*
 JONDI YLIJA P. RODRIGO
FINAL CHALLENGE NO.3
11-20-24
 */

public class UniversityEnrollment {

    public static void main(String[] args) {
        // Step 1: Create a one-dimensional array for student names (5 students)
        String[] studentNames = {"Xandra", "Jed", "Jerol", "Gab", "Cherine"};

        // Step 2: Create a two-dimensional array for grades (5 students, 3 subjects)
        // Each row represents a student, and each column represents a subject's grade
        int[][] grades = {
            {85, 90, 92},  // Grades for Xandra (3 subjects)
            {79, 84, 88},  // Grades for Jed
            {91, 89, 95},  // Grades for Jerol
            {74, 76, 80},  // Grades for Gab
            {88, 93, 91}   // Grades for Cherine
        };

        // Step 3: Calculate and display the average grade for each student
        for (int i = 0; i < studentNames.length; i++) {
            // Sum the grades for the current student (i-th student)
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }

            // Calculate the average grade
            double averageGrade = sum / (double) grades[i].length;  // Cast to double for precision

            // Display the student's name and average grade
            System.out.println(studentNames[i] + "'s Average Grade: " + averageGrade);
        }
    }
}

