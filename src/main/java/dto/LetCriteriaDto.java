package dto;

public class LetCriteriaDto {
	private String pocetnaDestinacija;
	private String krajnjaDestinacija;
	private Integer minDuzina;
	private Integer maxDuzina;
	private Integer minCena;
	private Integer maxCena;
	private Integer minDaljina;
	private Integer maxDaljina;
	private Integer brojStranice;
	
	public LetCriteriaDto() {
		brojStranice = 0;
		pocetnaDestinacija = "";
		krajnjaDestinacija = "";
	}
	
	public String getPocetnaDestinacija() {
		return pocetnaDestinacija;
	}
	public void setPocetnaDestinacija(String pocetnaDestinacija) {
		this.pocetnaDestinacija = pocetnaDestinacija;
	}
	public String getKrajnjaDestinacija() {
		return krajnjaDestinacija;
	}
	public void setKrajnjaDestinacija(String krajnjaDestinacija) {
		this.krajnjaDestinacija = krajnjaDestinacija;
	}
	public Integer getMinDuzina() {
		return minDuzina;
	}
	public void setMinDuzina(Integer minDuzina) {
		this.minDuzina = minDuzina;
	}
	public Integer getMaxDuzina() {
		return maxDuzina;
	}
	public void setMaxDuzina(Integer maxDuzina) {
		this.maxDuzina = maxDuzina;
	}
	public Integer getMinCena() {
		return minCena;
	}
	public void setMinCena(Integer minCena) {
		this.minCena = minCena;
	}
	public Integer getMaxCena() {
		return maxCena;
	}
	public void setMaxCena(Integer maxCena) {
		this.maxCena = maxCena;
	}
	
	public Integer getMinDaljina() {
		return minDaljina;
	}

	public void setMinDaljina(Integer minDaljina) {
		this.minDaljina = minDaljina;
	}

	public Integer getMaxDaljina() {
		return maxDaljina;
	}

	public void setMaxDaljina(Integer maxDaljina) {
		this.maxDaljina = maxDaljina;
	}
	
	public Integer getBrojStranice() {
		return brojStranice;
	}

	public void setBrojStranice(Integer brojStranice) {
		this.brojStranice = brojStranice;
	}
	
	public String getQuery() {
		String query = "?";
		if(!pocetnaDestinacija.isBlank()) {
			query += "dprt=" + pocetnaDestinacija + "&";
		}
		if(!krajnjaDestinacija.isBlank()) {
			query += "arvl=" + krajnjaDestinacija + "&";
		}
		if(minDuzina != null && maxDuzina != null) {
			query += "nduz=" + minDuzina.toString() + "&xduz=" + maxDuzina.toString() + "&";
		}
		if(minCena != null && maxCena != null) {
			query += "ncen=" + minCena.toString() + "&xcen=" + maxCena.toString() + "&";
		}
		if(minDaljina != null && maxDaljina != null) {
			query += "ndal=" + minDaljina.toString() + "&xdal=" + maxDaljina.toString() + "&";
		}
		query += "bstr=" + brojStranice;
		return query;
	}
}
