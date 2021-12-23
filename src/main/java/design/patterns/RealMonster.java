package design.patterns;

public class RealMonster extends AbstractMonster {
	
	public RealMonster(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
}
