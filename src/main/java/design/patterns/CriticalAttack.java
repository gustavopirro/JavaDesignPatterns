package design.patterns;

public class CriticalAttack extends Attack{
	
	private double damageModifier = 2.0;
	private double precisionModifier = 2.0;

	@Override
	public double getDamageModifier() {
		return this.damageModifier;
	}

	@Override
	public double getPrecisionModifier() {
		return this.precisionModifier;
	}

}
