package member_crud;

public class MemberDTO {
	String id, pw, name, email, phone, address, indate;
	// 자바 - int, double, date , String 
	// db- int, double, datetime , char/varchar
	// hire_date, "%Y"
	public MemberDTO() {}
	public MemberDTO(String id, String name, String indate) {
		super();
		this.id = id;
		this.name = name;
		this.indate = indate;
	}
	
	
	public MemberDTO(String id, String pw, String name, String email, String phone, String address, String indate) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.indate = indate;
	}
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + " , indate= " + indate + "]";
	}
	
	
	
}
