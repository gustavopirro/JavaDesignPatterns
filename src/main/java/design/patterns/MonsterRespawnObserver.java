package design.patterns;

public class MonsterRespawnObserver implements Observer{
	
	private Player player;
	
	public MonsterRespawnObserver(Player player) {
		super();
		this.player = player;
	}
	
	public void notify(Observable observable, String message) {
		System.out.println(this.player.getPlayerName() + " was notified: "+ observable +" " + message);
		
	}

}
