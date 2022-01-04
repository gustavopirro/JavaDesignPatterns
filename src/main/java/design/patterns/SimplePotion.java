package design.patterns;

public class SimplePotion implements UsablePotion{
	private String name;
	private String type;
	private String description;
	private double potionStrength;
	
	public SimplePotion(String name, String type, double potionStrength) {
		this.name = name;
		this.type = type;
		this.potionStrength = potionStrength;
	}

	public String getName() {
		return this.name;
	}

	public String getType() {
		return this.type;
	}

	public String getDescription() {
		return this.description;
	}

	public double getPotionStrength() {
		return this.potionStrength;
	}
	
	@Override
	public String toString() {
		return this.name + ", with " + this.potionStrength + " potion strength";
	}
	
}
