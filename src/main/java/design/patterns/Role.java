package design.patterns;

public abstract class Role implements InterfaceRoleBasedSpecialAttack{
	private String roleName;
	private double hitPointsRate;
	
	public Role(String roleName, double hitPointsRate) {
		this.roleName = roleName;
		this.hitPointsRate = hitPointsRate;
	}
	
	public String getName() {
		return this.roleName;
	}
	
	public double getHitPointsRate() {
		return hitPointsRate;
	}

	public void setHitPointsRate(double hitPointsRate) {
		this.hitPointsRate = hitPointsRate;
	}

	public abstract double roleSpecialAttack();

}
