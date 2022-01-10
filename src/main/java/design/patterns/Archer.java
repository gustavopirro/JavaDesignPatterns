package design.patterns;

public class Archer extends Role {
	
	public Archer() {
		super("Archer", 0.8);
	}

	public double roleSpecialAttack() {
		Attack rangedAttack = new NormalAttack();
		double attackDamage = rangedAttack.getFinalAttackDamage() * 1.10;
		return attackDamage;
	}

}