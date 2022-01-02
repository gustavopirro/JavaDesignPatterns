package design.patterns;

public class Main {
	public static void main(String args[]) {
		
		//Implementation of Strategy Pattern
		Player playerOne = new Player("PlayerOne", new Archer());
		Player playerTwo = new Player("PlayerTwo", new Warrior());

		System.out.println(playerOne.getRoleName() + " final HitPoints:" + playerOne.getFinalHitPoints());
		System.out.println(playerTwo.getRoleName() + " final HitPoints:" + playerTwo.getFinalHitPoints());
		
		//Implementation of Null Object Pattern
		System.out.println("");
		AbstractMonster knownMonster = MonsterDAO.getMonster("Troll");
		AbstractMonster unknownMonster = MonsterDAO.getMonster("Werewolf");
		
		System.out.println(knownMonster.getName());
		System.out.println(unknownMonster.getName());
		
		//Implementation of Hook Method
		Attack normalAttack = new NormalAttack();
		Attack criticalAttack = new CriticalAttack();
		
		System.out.println("\n" + "Normal Attack Damage Pre-Modifier:" + normalAttack.getDamageStat());
		System.out.println("Normal Attack Final Damage:" + normalAttack.getFinalAttackDamage());
		System.out.println("Critical Attack Damage Pre-Modifier:" + criticalAttack.getDamageStat());
		System.out.println("Critical Attack Final Damage:" + criticalAttack.getFinalAttackDamage());
		
		//Implementation of State Pattern
		Buff buff = new Buff("Damage Buff", 10, new BuffActive());
		System.out.println("\n" + "Buff state:" + buff.getBuffState());
		System.out.println("Buff name: " + buff.getBuffName());
		System.out.println("Buff strength: " + buff.getBuffStrength());
		
		Attack attack = new NormalAttack();
		System.out.println("\n" + "Non buffed state attack damage: " + attack.getFinalAttackDamage());
		attack.setBuff(buff);
		System.out.println("Buffed state attack damage: " + attack.getFinalAttackDamage());
		
		buff.setBuffState(new BuffInactive());
		System.out.println("Inactive state buff attack damage: " + attack.getFinalAttackDamage());
		
		
	}
}