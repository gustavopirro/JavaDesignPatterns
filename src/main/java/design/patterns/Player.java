package design.patterns;

public class Player implements InterfaceHitPointsCalculation{
	private Role role;
	private String playerName;
	private double hitPoints = 100.0;
	private double finalHitPoints;
	
	public Player(String playerName, Role role) {
		this.playerName = playerName;
		this.role = role;
		this.finalHitPoints = calculateHitPoints();
	}
	
	public String getRoleName() {
		return this.role.getName();
	}

	public Role getRole(){
		return this.role;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public double getFinalHitPoints() {
		return this.finalHitPoints;
	}

	public double calculateHitPoints() {
		return this.hitPoints * this.role.getHitPointsRate();
	}
}
