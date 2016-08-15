package com.jensonjo.comparator;

import java.util.Comparator;

public class A_3_NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		A_1_Student student1 = A_1_Student.class.cast(o1);
		A_1_Student student2 = A_1_Student.class.cast(o2);
		int nameComp = student1.getName().compareTo(student2.getName());
		if (nameComp != 0) {
			return nameComp;
		}
		int lessonComp = student1.getLesson().compareTo(student2.getLesson());

		return lessonComp;
	}

}
