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

        //Get the first grade from the user and store
        System.out.print("Enter grade 1: ");
        grade1 = input.nextInt();

        //Get the second grade from the user and store
        System.out.print("Enter grade 2: ");
        grade2 = input.nextInt();

        //Print the name, and grades
        System.out.println("Student: " + studentName);
        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
    }


}
