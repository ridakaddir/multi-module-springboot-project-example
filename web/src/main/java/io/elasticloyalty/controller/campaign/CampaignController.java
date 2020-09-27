package io.elasticloyalty.controller.campaign;

import io.elasticloyalty.model.campaign.Campaign;
import io.elasticloyalty.service.campaign.CampaignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CampaignController {

    private CampaignService campaignService;

    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @GetMapping
    public List<Campaign> campaigns(){
        return campaignService.getCampaigns();
    }
}
