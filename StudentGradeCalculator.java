package task2.codsoft;

import java.util.Scanner;

public class StudentGradeCalculator {
	public static float percentage(int totalMarks, int noOfSubj) {
		float avgPercentage =( (float) totalMarks / (float)noOfSubj);
		return avgPercentage;
	}

	public static Character gradeCal(double per) {
		char grade;
		if (per >= 80) {
			grade = 'A';
		} else if (per >= 60 && per < 80) {
			grade = 'B';
		} else if (per >= 40 && per < 60) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		return grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*************Welcome to CodSoft  Task_2 , STUDENT GRADE CALCULATOR*****");
		
		String calculateAgain;
		Scanner sc = new Scanner(System.in);
		do {
			
		
		System.out.print("Enter Number of Subject : ");
		int n = sc.nextInt();
		int result = 0;
		System.out.println("Enter marks out of 100 :");
		for (int i = 1; i <= n; i++) {
			System.out.printf("Subject %d : ", i);
			int marks = sc.nextInt();
			if (marks > 100) {
				System.err.println("Invalid marks");
				break;
			}
			result = result + marks;
		}
		System.out.println("Total Marks : " + result);
		float percentage = (float)percentage(result, n);
		System.out.println("Your Average % : "+ percentage);
		char grade = gradeCal(percentage);
		System.out.println("your Grade : "+grade);
		
		
			System.out.println("------Do you want to recalculate? Enter (YES/Y) for Exit enter any Key-----");
			calculateAgain = sc.next().toLowerCase();
		}
		while(calculateAgain.equals("yes") || calculateAgain.equals("y"));
		System.out.println(".........Thanks....... \n      Exit");
	}

}
