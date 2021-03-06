package design.patterns;

public class Main {
	public static void main(String args[]) {
		
		//Implementation of Strategy Pattern
		Player playerOne = new Player("PlayerOne", new Archer());
		Player playerTwo = new Player("PlayerTwo", new Warrior());

		System.out.println(playerOne.getRoleName() + " special attack damage:" + playerOne.getRole().roleSpecialAttack());
		System.out.println(playerTwo.getRoleName() + " special attack damage:" + playerTwo.getRole().roleSpecialAttack());
		
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
		
		//Implementation of Observer Pattern
		MonsterRespawnObservable goblinRespawn = new MonsterRespawnObservable("Goblin");
		MonsterRespawnObservable dragonRespawn = new MonsterRespawnObservable("Dragon");
		
		Player genericPlayer = new Player("genericPlayer", new Archer());
		Player genericPlayer2 = new Player("genericPlayer2", new Warrior());
		Player genericPlayer3 = new Player("genericPlayer3", new Archer());
		
		MonsterRespawnObserver genericObserver = new MonsterRespawnObserver(genericPlayer);
		MonsterRespawnObserver genericObserver2 = new MonsterRespawnObserver(genericPlayer2);
		MonsterRespawnObserver genericObserver3 = new MonsterRespawnObserver(genericPlayer3);
		
		goblinRespawn.addObserver(genericObserver);
		goblinRespawn.addObserver(genericObserver2);
		goblinRespawn.addObserver(genericObserver3);
		
		dragonRespawn.addObserver(genericObserver);
		
		System.out.println();
		goblinRespawn.notify("has just respawned!");
		System.out.println();
		dragonRespawn.notify("is currently dead!");
		
		//Implementation of Composite Pattern
		UsablePotion smallPotion = new SimplePotion("Small Red Potion", "Health Potion", 10.0);
		UsablePotion bigPotion = new SimplePotion("Big Red Potion", "Health Potion", 30.0);
		UsablePotion specialPotion = new CombinedPotion(smallPotion, bigPotion);
		
		System.out.println();
		System.out.println(smallPotion);
		System.out.println(bigPotion);
		System.out.println(specialPotion);
		System.out.println("Combined Potion Strength: " + specialPotion.getPotionStrength());
		
		//Implementation of Chain of Responsibility Pattern
		UsablePotion averagePotion = new SimplePotion("Average Red Potion", "Health Potion", 10.0);
		PotionClassBuff meelePotionBuff = new PotionMeleeBuff();
		PotionClassBuff rangedPotionBuff = new PotionRangedBuff();
		
		
		try {
			meelePotionBuff.setNext(rangedPotionBuff);
			
			System.out.println("Potion default strength: " + averagePotion.getPotionStrength());
			System.out.println("Potion melee strength: " + meelePotionBuff.calculatePotionClassBuff(new Warrior(), averagePotion));
			System.out.println("Potion ranged strength: " + meelePotionBuff.calculatePotionClassBuff(new Archer(), averagePotion));
			
			//Throws RunTimeException
			rangedPotionBuff.setNext(null);
		} catch (RuntimeException ex) {
			System.err.println(ex);
		}
		
		
	}
}