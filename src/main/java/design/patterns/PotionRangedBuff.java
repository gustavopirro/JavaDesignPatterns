package design.patterns;

public class PotionRangedBuff implements PotionClassBuff{
	
	private PotionClassBuff next;
	
	public double calculatePotionClassBuff(Role role, UsablePotion potion) {
		if(role.getName() == "Archer") {
			return potion.getPotionStrength() * 1.1;
		}else {
			return next.calculatePotionClassBuff(role, potion);
		}
	}

	public void setNext(PotionClassBuff next) {
		if(next == null)
			throw new RuntimeException("Role not found");
		this.next = next;
		
	}
	
}
