package utility;

public class BLURL {
	private static final String KS_URL = "http://localhost:36250/api";
	private static final String KORISNIK_URL = "/korisnik";
	private static final String LOGIN_URL = "/login";
	private static final String RESERVE_URL = "/reserve";
	private static final String ADMIN_URL = "/admin";
	private static final String CC_URL = "/cc";
	
	private static final String SZL_URL = "http://localhost:26530/api";
	private static final String LET_URL = "/let";
	private static final String AVION_URL = "/avion";
	
	//private static final String SZAK_URL = "http://localhost:13770/api";
	//private static final String KARTA_URL = "/karta";
	
	public static final String AMQUEUE_FIDS = "removed_flight_ids";
	public static final String AMQUEUE_REFUND = "refund_ticket";
	
	//private static final String EUREKA_URL = "http://localhost:8761";
	private static final String GATEWAY_URL = "http://localhost:8080";
	
	private BLURL() {
		
	}
	
	public static final String getAdminURL() {
		return KS_URL + ADMIN_URL;
	}
	
	public static final String getKSReserveURL(Long korisnikId) {
		return KS_URL + KORISNIK_URL + "/" + korisnikId.toString() + CC_URL + RESERVE_URL;
	}
	
	public static final String getLetURL(Long letId) {
		return SZL_URL + LET_URL + "/" + letId.toString();
	}
	
	public static String getGatewayAdminURL() {
		return KS_URL + ADMIN_URL;
	}
	
	public static String getGatewayUserLoginURL() {
		return KS_URL + KORISNIK_URL + LOGIN_URL;
	}
	
	public static String getGatewayUserCreateURL() {
		return KS_URL + KORISNIK_URL;
	}
	
	public static String getGatewayUserOperationURL(Long korisnikId) {
		return KS_URL + KORISNIK_URL + "/" + korisnikId.toString();
	}
	
	public static String getGatewayCCOperationURL(Long korisnikId) {
		return KS_URL + KORISNIK_URL + "/" + korisnikId.toString() + CC_URL;
	}
	
	public static String getGatewayCCDisplayURL(Long korisnikId, Integer brojStranice) {
		return KS_URL + KORISNIK_URL + "/" + korisnikId.toString() + CC_URL + "?bstr=" + brojStranice.toString();
	}
	
	public static String getGatewayCCDeleteURL(Long korisnikId, Long ccId) {
		return KS_URL + KORISNIK_URL + "/" + korisnikId.toString() + CC_URL + "/" + ccId.toString();
	}
	
	public static String getGatewayPlaneCreateURL() {
		return SZL_URL + AVION_URL;
	}
	
	public static String getGatewayDisplayPlanesURL(Integer brojStranice) {
		return SZL_URL + AVION_URL + "?bstr=" + brojStranice.toString();
	}
	
	public static String getGatewayPlaneDeleteURL(Long avionId) {
		return SZL_URL + AVION_URL + "/" + avionId.toString();
	}
	
	public static String getGatewayFlightCreateURL() {
		return SZL_URL + LET_URL;
	}
	
	public static String getGatewayFlightQueryURL(String query) {
		return SZL_URL + LET_URL + query;
	}
	
	public static String getGatewayFlightDeleteURL(Long letId) {
		return SZL_URL + LET_URL + "/" + letId.toString();
	}
}
