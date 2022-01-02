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
	
	public String getPlayerName() {
		return playerName;
	}
	
	public double getFinalHitPoints() {
		return this.finalHitPoints;
	}

//	Implemented interface to calculate
//	Hit Points of each Role
//	as Strategy Pattern Example
	public double calculateHitPoints() {
		return this.hitPoints * this.role.getHitPointsRate();
	}
}
