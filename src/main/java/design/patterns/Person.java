package design.patterns;

public class Person {
	
	public String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public String greetings() {
		return "Hello my name is  " + this.name;
	}
}
