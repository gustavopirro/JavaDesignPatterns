package design.patterns;

public interface PotionClassBuff {
	
	double calculatePotionClassBuff(Role role, UsablePotion potion);
	
	void setNext(PotionClassBuff next);
	
}
