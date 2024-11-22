package in.prudentcampus.admindemo.repository;

import java.util.List;

import in.prudentcampus.admindemo.model.Student;

public interface StudentRepository {
	public boolean isAddStudent(Student model);
	public List<Student> getAllStudents();
	public boolean isDeleteById(int userid);

}
