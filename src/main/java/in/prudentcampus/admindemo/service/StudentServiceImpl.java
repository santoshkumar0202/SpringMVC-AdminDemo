package in.prudentcampus.admindemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.prudentcampus.admindemo.model.Student;
import in.prudentcampus.admindemo.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository studentRepo;
	@Override
	public boolean isAddStudent(Student model) {
		// TODO Auto-generated method stub
		boolean b=studentRepo.isAddStudent(model);
		return b;
	}
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.getAllStudents();
	}
	@Override
	public boolean isDeleteById(int userid) {
		// TODO Auto-generated method stub
		return studentRepo.isDeleteById(userid);
	}
	

}
