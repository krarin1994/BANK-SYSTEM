package banking;

import java.io.Serializable;

public class Create_New_Acc implements Serializable
{
   private String name, fname, emailid, mobno, add, gender, dob;

public Create_New_Acc(String name, String fname, String emailid,
		String mobno, String add, String gender, String dob) {
	super();
	this.name = name;
	this.fname = fname;
	this.emailid = emailid;
	this.mobno = mobno;
	this.add = add;
	this.gender = gender;
	this.dob = dob;
}
public Create_New_Acc()
{
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getEmailid() {
	return emailid;
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}

public String getMobno() {
	return mobno;
}

public void setMobno(String mobno) {
	this.mobno = mobno;
}

public String getAdd() {
	return add;
}

public void setAdd(String add) {
	this.add = add;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}  

}