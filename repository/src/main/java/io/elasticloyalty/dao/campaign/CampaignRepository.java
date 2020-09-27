package io.elasticloyalty.dao.campaign;

import io.elasticloyalty.model.campaign.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Integer> {
}
