package design.patterns;

public class Role {
	private String name;
	private double HitPoints = 100.0;
	
	public Role(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getHitPoints() {
		return this.HitPoints;
	}
}
