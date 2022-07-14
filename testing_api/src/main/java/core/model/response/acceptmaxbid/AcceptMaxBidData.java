package core.model.response.acceptmaxbid;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AcceptMaxBidData {
	@JsonProperty("item_info")
	private ItemInfoData itemInfo;
	
	@JsonProperty("auction_info")
	private AuctionInfoData auctionInfo;
	
}	