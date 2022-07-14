package core.model.response.acceptmaxbid;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuctionInfoData {
	
	private String title;
	
	@JsonProperty("start_date")
	private String startdate;
	@JsonProperty("end_date")
	private String enddate;
	
	
}	
