package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Note;

public class Avaliation {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Note student = new Note();
		
		System.out.print("Enter the student name: ");
		student.name = sc.nextLine();
		
		System.out.print("\nEnter the first quarter grade: ");
		student.noteFirstGrade = sc.nextDouble();
		
		System.out.print("Enter the first quarter grade: ");
		student.noteSecondGrade = sc.nextDouble();
		
		System.out.print("Enter the first quarter grade: ");
		student.noteThirdGrade = sc.nextDouble();
		
		System.out.println("\nFINAL GRADE\nStudent: " + student);

		if(student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.println("\nMISSING " + student.missingPoints() + " POINTS");
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
