package Encapsulation;

public class Person {
private int id;
private String name;
private String gender;
private String DOB;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", DOB=" + DOB + "]";
}

}
