package odev_Gun4Odev3;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign, String title, double percentage) {
		campaign.setTitle(title);
		campaign.setPercentage(percentage);
		System.out.println("%"+campaign.getPercentage()+" lik "+campaign.getTitle()+" Eklendi");
		
	}

	@Override
	public void updateCampaign(Campaign campaign, String title, double percentage) {
		campaign.setTitle(title);
		campaign.setPercentage(percentage);
		System.out.println("Kampanya %"+campaign.getPercentage()+" lik "+campaign.getTitle()+" Olarak Güncellendi");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getTitle()+ " Silindi");
		
	}

}
