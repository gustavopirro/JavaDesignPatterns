package design.patterns;

public class BuffInactive extends BuffState {
	
	private int isActive = 0;
	
	public BuffInactive() {
		super();
	}
	
	@Override
	public int onOff() {
		return isActive;
	}
	
}
