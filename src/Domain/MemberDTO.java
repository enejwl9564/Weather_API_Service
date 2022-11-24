package Domain;

public class MemberDTO extends DTO {
	private String memId;
	private String pwd;
	private String name;
	private int mrole;	//1 회원 , 2 관리자
	
	
	
	public int getMrole() {
		return mrole;
	}
	public void setMrole(int mrole) {
		this.mrole = mrole;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

	@Override
	public String toString() {
		return "MemberDTO [memId=" + memId + ", pwd=" + pwd + ", name=" + name + ", mrole=" + mrole + "]";
	}
	public MemberDTO(String memId) {
		super();
		this.memId = memId;
	}
	
	public MemberDTO(String memId, String pwd) {
		super();
		this.memId = memId;
		this.pwd = pwd;
		this.mrole = 0;
	}
	public MemberDTO(String memId, String pwd, int role) {
		super();
		this.memId = memId;
		this.pwd = pwd;
		this.mrole = role;
	}
	public MemberDTO(String memId, String pwd, String name) {
		super();
		this.memId = memId;
		this.pwd = pwd;
		this.name = name;
	}
	
	public MemberDTO(String memId, String pwd, String name, int role) {
		super();
		this.memId = memId;
		this.pwd = pwd;
		this.name = name;
		this.mrole = role;
	}
	public MemberDTO() {}
	//Getter and Setter
	//디폴트 생성자
	//모든인자 받는 생성자
	//toString() 재정의
	
}
