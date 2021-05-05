package odev_Gun4Odev3;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		CustomerService customerManager = new CustomerManager(new CustomerCheckManager());
		
		//M��teri Ekleme
		customerManager.signUp(customer1, 2021001, "Bahri", "Asan", "28682177056", 1985);
		
		//M��teri G�ncelleme
		customerManager.update(customer1, 2021001, "Tuba", "Asan", "51487221976", 1989);
		
		//M��teri Silme
		customerManager.delete(customer1);
		
		
		//Oyun Sat���
		GameService gameManager = new GameManager(new Campaign("Yaz Kampanyas�",30));
		gameManager.buyGame(new Game(1,"AOE"), customer1);
		
		
		//Kampanya Ekleme
		Campaign campaign1 = new Campaign();
		CampaignService campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1,"Karantina Kampanyas�",20);
		
		//Kamapanya G�ncelleme
		campaignManager.updateCampaign(campaign1,"17 G�nl�k Bayram Karantina Kampanyas�",25);
		
		//Kampanya Silme
		campaignManager.deleteCampaign(campaign1);
		
		

	}

}
