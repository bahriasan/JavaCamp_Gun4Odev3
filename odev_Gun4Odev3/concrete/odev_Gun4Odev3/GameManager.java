package odev_Gun4Odev3;

public class GameManager implements GameService{
	
	Campaign campaign;
	
	public GameManager(Campaign campaign) {
		this.campaign=campaign;
	}

	@Override
	public void buyGame(Game game, Customer customer) {
		System.out.println(game.getTitle()+" isimli Oyun "+customer.getFirstName()+
				" isimli Oyuncu Tarafýndan "+campaign.getTitle()+" Kapsamýnda "+ 
				"%"+campaign.getPercentage()+" Ýndirimli Olarak Alýndý.");
		
	}

}
