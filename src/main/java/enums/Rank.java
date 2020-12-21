package enums;

public enum Rank {
	ZLATO(10000, 20), SREBRO(1000, 10), BRONZA(0, 0);
	
	private final Integer milje;
	private final Integer popust;
	
	private Rank(Integer milje, Integer popust) {
		this.milje=milje;
		this.popust = popust;
	}
	
	public Integer getMilje() {
		return this.milje;
	}
	
	public Integer getPopust() {
		return this.popust;
	}
	
	public static Rank getRankForMilje(Integer milje) {
		for(Rank rank : Rank.values()) {
			if(milje >= rank.milje) {
				return rank;
			}
		}
		return null;
	}
}