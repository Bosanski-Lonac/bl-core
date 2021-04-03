package dto;

import javax.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.ArrayList;
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
    private List<String> gradovi;

    public LetoviInfoDto(BigDecimal minCena, BigDecimal maxCena, Integer minDuzina, Integer maxDuzina) {
        this.minCena = minCena;
        this.maxCena = maxCena;
        this.minDuzina = minDuzina;
        this.maxDuzina = maxDuzina;
        gradovi = new ArrayList<>();
    }

    public LetoviInfoDto() {

    }

    public BigDecimal getMinCena() { return minCena; }
    public BigDecimal getMaxCena() { return maxCena; }
    public Integer getMinDuzina() { return minDuzina; }
    public Integer getMaxDuzina() { return maxDuzina; }
    public List<String> getGradovi() { return gradovi; }
    public void setMinCena(BigDecimal minCena) { this.minCena = minCena; }
    public void setMaxCena(BigDecimal maxCena) { this.maxCena = maxCena; }
    public void setMinDuzina(Integer minDuzina) { this.minDuzina = minDuzina; }
    public void setMaxDuzina(Integer maxDuzina) { this.maxDuzina = maxDuzina; }
    public void setGradovi(List<String> gradovi) { this.gradovi = gradovi; }
}
