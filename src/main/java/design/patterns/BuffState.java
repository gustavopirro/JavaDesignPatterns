package design.patterns;

public abstract class BuffState {
	
	private Buff buff;
	
	public BuffState() {
		super();
	}
	
	public abstract int onOff();
	
	public Buff getBuff() {
		return buff;
	}

	public void setBuff(Buff buff) {
		this.buff = buff;
	}
	


	
}
