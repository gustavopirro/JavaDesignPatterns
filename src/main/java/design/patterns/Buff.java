package design.patterns;

public class Buff {
	
	private BuffState buffState;
	private String buffName;
	private int buffStrength;
	
	public Buff(String buffName, int buffStrength, BuffState buffState) {
		this.buffName = buffName;
		this.buffStrength = buffStrength;
		this.buffState = buffState;
	}
	
	public void setBuffState(BuffState buffState) {
		this.buffState = buffState;
	}
	
	public int getBuffStrength() {
		return buffStrength * buffState.onOff();
	}

	public int getBuffState() {
		return buffState.onOff();
	}

	public String getBuffName() {
		return buffName;
	}
}

