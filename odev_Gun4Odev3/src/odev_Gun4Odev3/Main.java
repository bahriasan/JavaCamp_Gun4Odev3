package odev_Gun4Odev3;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		CustomerService customerManager = new CustomerManager(new CustomerCheckManager());
		
		//Müþteri Ekleme
		customerManager.signUp(customer1, 2021001, "Bahri", "Asan", "28682177056", 1985);
		
		//Müþteri Güncelleme
		customerManager.update(customer1, 2021001, "Tuba", "Asan", "51487221976", 1989);
		
		//Müþteri Silme
		customerManager.delete(customer1);
		
		
		//Oyun Satýþý
		GameService gameManager = new GameManager(new Campaign("Yaz Kampanyasý",30));
		gameManager.buyGame(new Game(1,"AOE"), customer1);
		
		
		//Kampanya Ekleme
		Campaign campaign1 = new Campaign();
		CampaignService campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1,"Karantina Kampanyasý",20);
		
		//Kamapanya Güncelleme
		campaignManager.updateCampaign(campaign1,"17 Günlük Bayram Karantina Kampanyasý",25);
		
		//Kampanya Silme
		campaignManager.deleteCampaign(campaign1);
		
		

	}

}
