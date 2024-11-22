package in.prudentcampus.admindemo.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.prudentcampus.admindemo.model.AdminLogin;
import in.prudentcampus.admindemo.model.Student;
import in.prudentcampus.admindemo.service.StudentService;

@Controller
public class HomeController {

	@Autowired
	StudentService studentSevrice;
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value="/validate",method=RequestMethod.POST)
	public String masterpage(AdminLogin login)
		{
		if(login.getName().equals("admin") &&login.getPass().equals("admin"))
{
			return "master";

		}
		else {
			return "home";

		}
	}
	@RequestMapping(value="/addnewstudent",method=RequestMethod.GET)
	public String addnewStudent()
	{
		return "addnewrecord";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveRecord(Student model ,Map map) 
	{
		boolean b=studentSevrice.isAddStudent(model);
		if(b)
		{
			map.put("msg","Record successfully added!");
		}
		else 
		{
			map.put("msg", "Oops something went wrong !");
				}
		return "addnewrecord";

		}
	
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String viewallrecord(Map map)
	{
		List <Student>list= studentSevrice.getAllStudents();
		map.put("studentrecord", list);
		return "viewallrecord";
	}
	
	@RequestMapping(value="/del",method=RequestMethod.GET)
	public String deleteRecord(@RequestParam("userid")Integer id,Map map)
	{
		studentSevrice.isDeleteById(id);
		List<Student> list=studentSevrice.getAllStudents();
		map.put("studentrecord",list);
		return "viewallrecord";
	}
}

