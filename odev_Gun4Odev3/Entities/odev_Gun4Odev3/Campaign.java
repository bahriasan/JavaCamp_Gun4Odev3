package odev_Gun4Odev3;

public class Campaign implements Entities {
	
	String title;
	double percentage;

	public Campaign() {
		
	}
	
	public Campaign(String title, double percentage) {
		this.title = title;
		this.percentage = percentage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	

}
