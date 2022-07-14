package core.model.response.acceptmaxbid;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemInfoData {
	
	private String name;
	
	@JsonProperty("selling_user")
	private SellingInfoData sellingUser;
	
	@JsonProperty("buying_user")
	private BuyerInfoData buyingUser;
	
	private String brand;
	
	private String series;
	
	@JsonProperty("starting_price")
	private String startingPrice;
	
	@JsonProperty("max_price")
	private String maxPrive;
	
	@JsonProperty("selling_info")
	private String sellingInfo;
	
	
}	