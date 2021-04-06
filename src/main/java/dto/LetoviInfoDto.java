package dto;

import javax.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.List;

public class LetoviInfoDto {
    @Positive(message = "Cena karte mora biti veca od 0")
    private BigDecimal minCena;
    @Positive(message = "Cena karte mora biti veca od 0")
    private BigDecimal maxCena;
    @Positive(message = "Duzina leta mora biti veca od 0")
    private Integer minDuzina;
    @Positive(message = "Duzina leta mora biti veca od 0")
    private Integer maxDuzina;
    @Positive(message = "Trajanje leta mora biti vece od 0")
    private Integer minDaljina;
    @Positive(message = "Trajanje leta mora biti vece od 0")
    private Integer maxDaljina;
    private List<String> gradovi;

    public BigDecimal getMinCena() { return minCena; }
    public BigDecimal getMaxCena() { return maxCena; }
    public Integer getMinDuzina() { return minDuzina; }
    public Integer getMaxDuzina() { return maxDuzina; }
    public Integer getMinDaljina() { return minDaljina; }
    public Integer getMaxDaljina() { return maxDaljina; }
    public List<String> getGradovi() { return gradovi; }
    public void setMinCena(BigDecimal minCena) { this.minCena = minCena; }
    public void setMaxCena(BigDecimal maxCena) { this.maxCena = maxCena; }
    public void setMinDuzina(Integer minDuzina) { this.minDuzina = minDuzina; }
    public void setMaxDuzina(Integer maxDuzina) { this.maxDuzina = maxDuzina; }
    public void setMinDaljina(Integer minDaljina) { this.minDaljina = minDaljina; }
    public void setMaxDaljina(Integer maxDaljina) { this.maxDaljina = maxDaljina; }
    public void setGradovi(List<String> gradovi) { this.gradovi = gradovi; }
}
