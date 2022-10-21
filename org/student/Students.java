package org.student;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("The ID of the student is " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("The ID of the student is " + id);
		System.out.println("The student name is " + name);
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("The email ID of the student is " + email);
		System.out.println("The student phonenumber is " + phoneNumber);
	}

	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(123);
		stud.getStudentInfo(123, "Haripriya");
		stud.getStudentInfo("test@gmail.com", 2115477744);

	}
}
