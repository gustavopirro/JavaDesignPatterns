package design.patterns;

import java.util.ArrayList;
import java.util.List;

public class MonsterRespawnObservable implements Observable {
	private String name;

	private List<Observer> observers;
	
	public MonsterRespawnObservable(String name) {
		super();
		this.name = name;
	}
	
	public void addObserver(Observer observer) {
		getObservers().add(observer);
	}
	
	public void removeObserver(Observer observer) {
		getObservers().remove(observer);
	}
	
	private List<Observer> getObservers(){
		if(observers == null)
			this.observers = new ArrayList<Observer>();
		return observers;
	}
	
	public void notify(String message) {
		for (Observer o : observers) 
			o.notify(this, message);
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
