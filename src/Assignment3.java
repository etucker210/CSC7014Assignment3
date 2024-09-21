/*
 * File Name: Assignment3.java
 * Author:    Elijah Tucker
 * Last Edit: 21 Sep 2024
 *
 * Prompt: Create a program that accepts a student's name and their grades for two subjects.
 *         The program should then determine whether the student has passed or failed based
 *         on the following simple criteria:
 *         - Pass: The student must have a grade of 50 or above in both subjects.
 *         - Fail: The student fails if they score below 50 in either of the two subjects.
 *         More details on the prompt can be found in README.md
 *
 * Note:   This project is controlled by VCS so no change log here
 *
 */

import java.util.Scanner; //The class needed to get data from the user

public class Assignment3 {

    public static void main(String[] args) {

        // Set up the local variables and input scanner
        String studentName;
        int grade1;
        int grade2;
        Scanner input = new Scanner(System.in);

        //Get the student name from the user and store
        System.out.print("Enter student name: ");
        studentName = input.nextLine();

        //Get the first grade from the user, store it and repeat if invalid
        do {

            System.out.print("Enter grade 1: ");
            grade1 = input.nextInt();

        } while ( !validateGrade(grade1) );

        //Get the second grade from the user, store it and repeat if invalid
        do {

            System.out.print("Enter grade 2: ");
            grade2 = input.nextInt();

        } while ( !validateGrade(grade2) );

        // Check if the student has passed or failed and print accordingly
        if ( checkIfPassed( grade1, grade2 ) ) {

            System.out.println( studentName + " has passed.");

        } else {

            System.out.println( studentName + " has failed.");

        }

    }

    /*
     * Function Name: validateGrade
     * Input:         grade - int - numeric grade to check
     * Output:        bool - true  = the grade is valid (i.e. 0 to 100)
     *                       false = the grade is invalid
     *
     * Description:   This function checks if the grade entered is between
     *                0 and 100. If it is it will return true. If it is not
     *                it will print "Grade is invalid" and return false.
     *
     */
    private static boolean validateGrade(int grade) {

        if (grade >=0 && grade <= 100) {

            return true;

        }

        System.out.println("Grade is invalid");
        return false;

    }

    /*
     * Function Name: checkIfPassed
     * Input:         grade1 - int - the first grade to check
     *                grade2 - int - the second grade to check
     * Output:        bool - true = both grades are at least 50
     *                       false = at least one grade below 50
     *
     * Description:   This function checks to see if both grades are at least a 50.
     *                If so it returns a true. If not it returns a false
     *
     */

    private static boolean checkIfPassed( int grade1, int grade2 ) {

        if ( grade1 < 50 ) {

            return false;

        } else {

            return ( grade2 >= 50 );

        }
    }
}
