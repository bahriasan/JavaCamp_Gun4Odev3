package odev_Gun4Odev3;

public interface CampaignService {
	
	void addCampaign(Campaign campaign, String title, double percentage);
	
	void updateCampaign(Campaign campaign, String title, double percentage);
	
	void deleteCampaign(Campaign campaign);
	

}
