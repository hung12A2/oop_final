package core.model.response.createbid;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBidData {
	@JsonProperty("auction_id")
	private String auctionId; 
	
	@JsonProperty("user_id")
	private int userId; 
	
	private String price;
	
	private String phone;
	
	@JsonProperty("updated_at")
	private String updatedAt;
}
