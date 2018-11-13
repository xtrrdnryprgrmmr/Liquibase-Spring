package lbasewithspring;

import java.math.BigInteger;
import java.util.Date;

public class Workers {

BigInteger	EmployeeId;
 String FirstName;
 String LastName;
 String Phone;
 Date JoiningDate;
 
 
 
public Workers(BigInteger employeeId, String firstName, String lastName, String phone, Date joiningDate) {

	EmployeeId = employeeId;
	FirstName = firstName;
	LastName = lastName;
	Phone = phone;
	JoiningDate = joiningDate;
}
public BigInteger getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(BigInteger employeeId) {
	EmployeeId = employeeId;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getPhone() {
	return Phone;
}
public void setPhone(String phone) {
	Phone = phone;
}
public Date getJoiningDate() {
	return JoiningDate;
}
public void setJoiningDate(Date joiningDate) {
	JoiningDate = joiningDate;
}
	
	
	
	
}
