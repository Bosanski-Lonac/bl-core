package enums;

public enum Rank {
	ZLATO(10000), SREBRO(1000), BRONZA(0);
	
	private final Integer milje;
	
	private Rank(Integer milje) {
		this.milje=milje;
	}
	
	public Integer getMilje() {
		return this.milje;
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