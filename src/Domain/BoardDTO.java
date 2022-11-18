package Domain;

public class BoardDTO extends DTO{
	
	private String memid;
	private String Bdate;
	private String Title;
	private String Categori;
	private String Constens;
	private int Bnum;
	private boolean isLend;
	
	public BoardDTO(){}

	public BoardDTO(int Bnum, String Title, String Categori) {
		super();
		this.Title = Title;
		this.Categori = Categori;
		this.memid = memid;
		this.Bnum = Bnum;
		this.isLend = true;
	}
	
	public BoardDTO(String Title, String Categori, String Constens) {
		super();
		this.Title = Title;
		this.Categori = Categori;
		this.Constens = Constens;
		this.isLend = true;
	}

	public BoardDTO(int Bum, String Title, String Categori, String memid, String constens) {
		super();
		this.Title = Title;
		this.Categori = Categori;
		this.memid = memid;
		this.Bnum = Bnum;
		this.Constens = Constens;
		this.isLend = true;
	}

	public BoardDTO(String memid, String bdate, String title, String categori, String constens, int bnum) {
		super();
		this.memid = memid;
		Bdate = bdate;
		Title = title;
		Categori = categori;
		Constens = constens;
		Bnum = bnum;
	}





	public int getBnum() {
		return Bnum;
	}



	public void setBnum(int bnum) {
		Bnum = bnum;
	}

	public String getMemid() {
		return memid;
	}
	public void setMemid(String memid) {
		this.memid = memid;
	}
	public String getBdate() {
		return Bdate;
	}
	public void setBdate(String bdate) {
		Bdate = bdate;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getCategori() {
		return Categori;
	}
	public void setCategori(String categori) {
		Categori = categori;
	}
	public String getConstens() {
		return Constens;
	}
	public void setConstens(String constens) {
		Constens = constens;
	}
	
	@Override
	public String toString() {
		return "BoardDTO [memid=" + memid + ", Bdate=" + Bdate + ", Title=" + Title + ", Categori=" + Categori
				+ ", Constens=" + Constens + "]";
	}
	
	
	
	

}
