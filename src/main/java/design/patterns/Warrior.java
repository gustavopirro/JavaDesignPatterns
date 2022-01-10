package design.patterns;

public class Warrior extends Role{
	
	public Warrior() {
		super("Warrior", 2.0);
	}

	public double roleSpecialAttack() {
		Attack rangedAttack = new CriticalAttack();
		double attackDamage = rangedAttack.getFinalAttackDamage() * 1.50;
		return attackDamage;
	}
}
