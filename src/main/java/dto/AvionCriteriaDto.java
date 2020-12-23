package dto;

public class AvionCriteriaDto {
	private String naziv;
	private Integer minKapacitet;
	private Integer maxKapacitet;
	private Integer brojStranice;

	public AvionCriteriaDto() {
		brojStranice=0;
		naziv="";
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Integer getMinKapacitet() {
		return minKapacitet;
	}

	public void setMinKapacitet(Integer minKapacitet) {
		this.minKapacitet = minKapacitet;
	}

	public Integer getMaxKapacitet() {
		return maxKapacitet;
	}

	public void setMaxKapacitet(Integer maxKapacitet) {
		this.maxKapacitet = maxKapacitet;
	}

	public Integer getBrojStranice() {
		return brojStranice;
	}

	public void setBrojStranice(Integer brojStranice) {
		this.brojStranice = brojStranice;
	}
	
	public String getQuery() {
		String query="?";
		if(!naziv.isBlank()) {
			query+= "name=" + naziv + "&";
		}
		if(minKapacitet!=null && maxKapacitet!=null) {
			query += "nkap=" + minKapacitet.toString() + "&xkap=" + maxKapacitet.toString() + "&";
		}
		query+="bstr"+brojStranice;
		return query;
	}
}
