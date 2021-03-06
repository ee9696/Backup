package test;

import java.text.DecimalFormat;

public class MemberDTO {
	private String name, id, pwd, email;
	
	public MemberDTO() {
		
	}
	
	public MemberDTO(String name, String id, String pwd, String email) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return name+"\t"+id+"\t"+pwd+"\t"+email;
	}
}
