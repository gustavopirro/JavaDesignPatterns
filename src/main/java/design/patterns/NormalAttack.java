package design.patterns;

public class NormalAttack extends Attack{
	
	private double damageModifier = 1.0;
	private double precisionModifier = 1.0;

	@Override
	public double getDamageModifier() {
		return this.damageModifier;
	}

	@Override
	public double getPrecisionModifier() {
		return this.precisionModifier;
	}

}
