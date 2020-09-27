package io.elasticloyalty.service.campaign;

import io.elasticloyalty.dao.campaign.CampaignRepository;
import io.elasticloyalty.model.campaign.Campaign;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CampaignService {

    private final CampaignRepository campaignRepository;

    @PostConstruct
    public void initCampaign(){
        campaignRepository.saveAll(
                Stream.of(
                        new Campaign(1, "C1"),
                        new Campaign(2, "C2")
                ).collect(Collectors.toList())
        );
    }

    public CampaignService(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    public List<Campaign> getCampaigns(){
        return campaignRepository.findAll();
    }

    public Campaign createCampaign(Campaign campaign){
        return campaignRepository.save(campaign);
    }
}
