public class Member {
	
	private String email, phonenumber, firstname, lastname, collegename, residentialaddress, city, postalcode, state_region, dob, highesteduation, mentorname;
	private String photoid, studentid, marksheet;
	
	public Member() {
		super();
	}
	
	public Member(String email, String phonenumber, String firstname, String lastname, String collegename,
			String residentialaddress, String city, String postalcode, String state_region, String dob,
			String highesteduation, String mentorname, String photoid, String studentid, String marksheet) {
		super();
		this.email = email;
		this.phonenumber = phonenumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.collegename = collegename;
		this.residentialaddress = residentialaddress;
		this.city = city;
		this.postalcode = postalcode;
		this.state_region = state_region;
		this.dob = dob;
		this.highesteduation = highesteduation;
		this.mentorname = mentorname;
		this.photoid = photoid;
		this.studentid = studentid;
		this.marksheet = marksheet;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getResidentialaddress() {
		return residentialaddress;
	}
	public void setResidentialaddress(String residentialaddress) {
		this.residentialaddress = residentialaddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getState_region() {
		return state_region;
	}
	public void setState_region(String state_region) {
		this.state_region = state_region;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getHighesteduation() {
		return highesteduation;
	}
	public void setHighesteduation(String highesteduation) {
		this.highesteduation = highesteduation;
	}
	public String getMentorname() {
		return mentorname;
	}
	public void setMentorname(String mentorname) {
		this.mentorname = mentorname;
	}
	public String getPhotoid() {
		return photoid;
	}
	public void setPhotoid(String photoid) {
		this.photoid = photoid;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getMarksheet() {
		return marksheet;
	}
	public void setMarksheet(String marksheet) {
		this.marksheet = marksheet;
	}
	
}
