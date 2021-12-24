package design.patterns;

public class BuffActive extends BuffState {
	
	private int isActive = 1;
	
	public BuffActive() {
		super();
	}
	
	@Override
	public int onOff() {
		return isActive;
	}
	
	
}
