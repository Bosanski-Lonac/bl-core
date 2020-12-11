package enums;

public enum Role {
	ROLE_USER(false),
	ROLE_ADMIN(true);
	
	private final boolean globalPermissions;
	
	private Role(boolean globalPermissions) {
		this.globalPermissions = globalPermissions;
	}
	
	public boolean getGlobalPermissions() {
		return this.globalPermissions;
	}
}
