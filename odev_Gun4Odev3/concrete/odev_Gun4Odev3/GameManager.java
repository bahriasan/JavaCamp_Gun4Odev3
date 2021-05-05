package odev_Gun4Odev3;

public class GameManager implements GameService{
	
	Campaign campaign;
	
	public GameManager(Campaign campaign) {
		this.campaign=campaign;
	}

	@Override
	public void buyGame(Game game, Customer customer) {
		System.out.println(game.getTitle()+" isimli Oyun "+customer.getFirstName()+
				" isimli Oyuncu Taraf�ndan "+campaign.getTitle()+" Kapsam�nda "+ 
				"%"+campaign.getPercentage()+" �ndirimli Olarak Al�nd�.");
		
	}

}
