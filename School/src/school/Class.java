package school;

import java.util.List;

public class Class {

	String name;
	List<Student> students;
	byte numberOfStudents;

	public Class(String name, List<Student> students) {
		this.name = name;
		this.students = students;
		String size = "" + students.size();
		numberOfStudents = Byte.parseByte(size);
	}

}
