package Domain;

public class BoardDTO extends DTO{
	
	private String Boardid;
	private String memid;
	private String Bdate;
	private String Title;
	private String Categori;
	private String Constens;
	
	public BoardDTO(){}

	
	public String getBoardid() {
		return Boardid;
	}

	public void setBoardid(String boardid) {
		Boardid = boardid;
	}

	
	public BoardDTO(String boardid, String memid, String bdate, String title, String categori, String constens) {
		super();
		Boardid = boardid;
		this.memid = memid;
		Bdate = bdate;
		Title = title;
		Categori = categori;
		Constens = constens;
	}


	public BoardDTO(int Bnum, String Title, String Categori) {
		super();
		this.Title = Title;
		this.Categori = Categori;
		this.memid = memid;
	}
	
	public BoardDTO(String Title, String Categori, String Constens) {
		super();
		this.Title = Title;
		this.Categori = Categori;
		this.Constens = Constens;
	}

	public BoardDTO(String Title, String Categori, String memid, String Constens) {
		super();
		this.Title = Title;
		this.Categori = Categori;
		this.memid = memid;
		this.Constens = Constens;
	}	

	public BoardDTO(String boardid, String bdate, String title, String categori, String constens) {
		super();
		Boardid = boardid;
		Bdate = bdate;
		Title = title;
		Categori = categori;
		Constens = constens;
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
		return "BoardDTO [Boardid=" + Boardid + ", memid=" + memid + ", Bdate=" + Bdate + ", Title=" + Title
				+ ", Categori=" + Categori + ", Constens=" + Constens + "]";
	}
	
	
	
	
	
	

}
