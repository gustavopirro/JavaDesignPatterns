package design.patterns;

public class Main {
	public static void main(String args[]) {
		
		//Implementation of Strategy Pattern
		Warrior warrior = new Warrior();
		Archer archer = new Archer();
		
		System.out.println("Warrior final HitPoints:" + warrior.getFinalHitPoints());
		System.out.println("Archer final HitPoints:" + archer.getFinalHitPoints());
		
		//Implementation of Null Object Pattern
		System.out.println("");
		AbstractMonster knownMonster = MonsterDAO.getMonster("Troll");
		AbstractMonster unknownMonster = MonsterDAO.getMonster("Werewolf");
		
		System.out.println(knownMonster.getName());
		System.out.println(unknownMonster.getName());
		
		//Implementation of Hook Method
		Attack normalAttack = new NormalAttack();
		Attack criticalAttack = new CriticalAttack();
		
		System.out.println("\nNormal Attack Damage Pre-Modifier:" + normalAttack.getDamageStat());
		System.out.println("Normal Attack Final Damage:" + normalAttack.getFinalAttackDamage());
		System.out.println("Critical Attack Damage Pre-Modifier:" + criticalAttack.getDamageStat());
		System.out.println("Critical Attack Final Damage:" + criticalAttack.getFinalAttackDamage());
		
	}
}