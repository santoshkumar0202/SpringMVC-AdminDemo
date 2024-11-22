package in.prudentcampus.admindemo.service;

import java.util.List;

import in.prudentcampus.admindemo.model.Student;

public interface StudentService {
	
	public boolean isAddStudent(Student model);
	public List<Student> getAllStudents();
	public boolean isDeleteById(int userid);
}
