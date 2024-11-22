package in.prudentcampus.admindemo.model;

public class Student {
public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getContact() {
		return contact;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
private String name;
private String email;
private String contact;
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
