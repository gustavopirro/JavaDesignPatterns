package design.patterns;

public class Main {
	public static void main(String args[]) {
		Warrior warrior = new Warrior();
		System.out.println(warrior.getFinalHitPoints());
		
		Archer archer = new Archer();
		System.out.println(archer.getFinalHitPoints());
	}
}