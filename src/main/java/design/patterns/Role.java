package design.patterns;

public class Role extends Player {
	private String name;
	
	public Role(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
