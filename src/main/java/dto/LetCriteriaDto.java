package dto;

public class LetCriteriaDto {
	private String pocetnaDestinacija;
	private String krajnjaDestinacija;
	private Integer minDuzina;
	private Integer maxDuzina;
	private Integer minCena;
	private Integer maxCena;
	
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
}
