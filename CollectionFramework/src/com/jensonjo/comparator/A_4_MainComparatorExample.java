package com.jensonjo.comparator;

import java.lang.reflect.Method;
import java.util.Arrays;

public class A_4_MainComparatorExample {
	public static void main(String args[]) {
		A_1_Student student[] = new A_1_Student[4];

		student[0] = new A_1_Student();
		student[0].setName("Nick");
		student[0].setGrade(19);
		student[0].setLesson("English");

		student[1] = new A_1_Student();
		student[1].setName("Helen");
		student[1].setGrade(12);
		student[1].setLesson("Hindi");

		student[2] = new A_1_Student();
		student[2].setName("Ross");
		student[2].setGrade(16);
		student[2].setLesson("Arabic");
		
		student[3] = new A_1_Student();
		student[3].setName("Nick");
		student[3].setGrade(19);
		student[3].setLesson("Arabic");
		
		System.out.println("Order of students before sorting is: ");

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + "\t" + student[i].getLesson()+ "\t" + student[i].getGrade());
		}

		Arrays.sort(student, new A_2_GradeComparator());
		System.out.println("Order of students after sorting by student grade is");

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + "\t" + student[i].getLesson()+ "\t" + student[i].getGrade());
		}

		Arrays.sort(student, new A_3_NameComparator());
		System.out.println("Order of students after sorting by student name is");

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + "\t" + student[i].getLesson()+ "\t" + student[i].getGrade());
		}
		
		
		Method[] methods = A_1_Student.class.getMethods();
		for(Method method : methods){
	        System.out.println("method = " + method.getName());
	    }
	}
}
