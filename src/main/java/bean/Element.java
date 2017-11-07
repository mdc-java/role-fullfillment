package bean;

import java.util.Random;

public class Element {
	
	private int id;
	private String description;
	
	public Element(){
		id = new Random().nextInt(100);
		description = "example" + new Random().nextInt(100);
	}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
}
