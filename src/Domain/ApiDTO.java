package Domain;

public class ApiDTO extends DTO {
	
	private String lon;
	private String lat;
	
	public ApiDTO() {}
	
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	
	public ApiDTO(String lon, String lat) {
		super();
		this.lon = lon;
		this.lat = lat;
	}
	
	@Override
	public String toString() {
		return "ApiDTO [lon=" + lon + ", lat=" + lat + "]";
	}
	
	

}
