package org.student;

import org.department.Department;

public class Student {
	public void studentName() {
		System.out.println("Haripriya");
	}

	public void studentDept() {
		System.out.println("BSC.CS");
	}

	public void studentId() {
		System.out.println("CS123");

	}

	public static void main(String args[]) {
		Department stud = new Department();
		stud.deptName();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
	}
}
