package odev_Gun4Odev3;

public class Game implements Entities{
	int id;
	String title;

	public Game() {
		
	}
	
	public Game(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	

}
