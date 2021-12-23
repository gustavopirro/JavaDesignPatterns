package design.patterns;

public abstract class Attack {
	
	protected Integer damage;
	protected Integer precision;
	
	public Attack() {
		this.damage = Utils.getRandomNumber(0, 50);
		this.precision = Utils.getRandomNumber(30, 80);
	}
	
	public Integer getDamageStat() {
		return this.damage;
	}

	public Integer getPrecisionStat() {
		return this.precision;
	}
	
	public double getFinalAttackDamage() {
		return this.damage * getDamageModifier();
	}
	
	public double getFinalPrecision() {
		return this.precision * getPrecisionModifier();
	}
	
	//Implementation of hook method, this method 
	//is implemented by the classes that
	//extends it and it is used in its super class.
	public abstract double getDamageModifier();
	public abstract double getPrecisionModifier();
	
}
