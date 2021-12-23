package design.patterns;

public class Main {
	public static void main(String args[]) {
		
		//Implementation of Strategy Pattern
		Warrior warrior = new Warrior();
		System.out.println("Warrior final HitPoints:" + warrior.getFinalHitPoints());
		
		Archer archer = new Archer();
		System.out.println("Archer final HitPoints:" + archer.getFinalHitPoints());
		
		//Implementation of Null Object Pattern
		AbstractMonster knownMonster = MonsterDAO.getMonster("Troll");
		AbstractMonster unknownMonster = MonsterDAO.getMonster("Werewolf");
		
		System.out.println(knownMonster.getName());
		System.out.println(unknownMonster.getName());
		
		
		
		
	}
}