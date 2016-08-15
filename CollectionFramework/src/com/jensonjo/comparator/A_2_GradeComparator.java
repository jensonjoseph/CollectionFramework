package com.jensonjo.comparator;

import java.util.Comparator;

public class A_2_GradeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		A_1_Student student1 = A_1_Student.class.cast(o1);
		A_1_Student student2 = A_1_Student.class.cast(o2);
		

		return student1.getGrade() - student2.getGrade();
	}

}
