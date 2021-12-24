package design.patterns;

public abstract class Attack {
	
	protected Integer damage;
	protected Integer precision;
	private Buff buff;
	
	public Buff getBuff() {
		return buff;
	}

	public void setBuff(Buff buff) {
		this.buff = buff;
	}

	public Attack() {
		this.damage = Utils.getRandomNumber(0, 50);
		this.precision = Utils.getRandomNumber(30, 80);
		this.buff = new Buff("Damage Buff", 10, new BuffInactive());
	}
	
	public Integer getDamageStat() {
		return this.damage;
	}

	public Integer getPrecisionStat() {
		return this.precision;
	}
	
	public double getFinalAttackDamage() {
		return this.damage * getDamageModifier() + this.buff.getBuffStrength();
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
