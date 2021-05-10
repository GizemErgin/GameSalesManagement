package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign T) {
		System.out.println("Kampanya eklendi: " + T.getCampaignName());
	}

	@Override
	public void delete(Campaign T) {
		System.out.println("Kampanya silindi: " + T.getCampaignName());

	}

	@Override
	public void update(Campaign T) {
		System.out.println("Kampanya güncellendi: " + T.getCampaignName());
	}

}
