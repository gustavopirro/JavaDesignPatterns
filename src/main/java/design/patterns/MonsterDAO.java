package design.patterns;

public class MonsterDAO {
	
	public static final String[] monsters = {
			"Goblin",
			"Troll",
			"Witch",
			"Dragon"
	};
	
	public static AbstractMonster getMonster(String name) {
		
		for (int i = 0 ; i < monsters.length; i++)
			if(monsters[i].equalsIgnoreCase(name)) 
				return new RealMonster(name);
		
		return new NullMonster();
	}
}
