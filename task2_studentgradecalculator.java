package Internship;
import java.util.Scanner;

public class task2_studentgradecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of subjects: ");
		int noofsub=sc.nextInt();
		int[] marks=new int[noofsub];
		int totalmarks=0;
		for(int i=0;i<noofsub;i++) {
			System.out.print("enter the marks sunject "+(i+1)+": ");
			marks[i]=sc.nextInt();
			totalmarks+=marks[i];
		}
		double avgofsub=(double)totalmarks/noofsub;
		char grade;
		if(avgofsub>=90) {
			grade = 'O';
		}
		else if(avgofsub>=80) {
			grade = 'A';
		}
		else if(avgofsub>=70) {
			grade = 'B';
		}
		else if(avgofsub>=60) {
			grade = 'C';
		}
		else if(avgofsub>=50) {
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		System.out.println("Results : ");
		System.out.println(" ");
		System.out.println("    Total marks : "+totalmarks);
		System.out.println("    Avarage persentage :"+avgofsub);
		System.out.println("    Grade is :"+grade);
	}
}