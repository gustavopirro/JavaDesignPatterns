package design.patterns;

public class CombinedPotion implements UsablePotion {
	private UsablePotion potionOne;
	private UsablePotion potionTwo;
	private double potionStrength;
	
	public CombinedPotion(UsablePotion potionOne, UsablePotion potionTwo) {
		this.potionOne = potionOne;
		this.potionTwo = potionTwo;
		this.potionStrength = this.potionOne.getPotionStrength() + this.potionTwo.getPotionStrength();
	}

	public String getName() {
		return "Super Potion";
	}

	public String getType() {
		return "Combined Potion";
	}

	public String getDescription() {
		return "This is a combined potion made with " + this.potionOne + "and " + this.potionTwo;
	}

	public double getPotionStrength() {
		return this.potionStrength;
	}
	
	@Override
	public String toString() {
		return "Combined Potions: " + this.potionOne + " and " + this.potionTwo;
	}
}
