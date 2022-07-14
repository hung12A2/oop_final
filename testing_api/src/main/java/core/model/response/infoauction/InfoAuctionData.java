package core.model.response.infoauction;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoAuctionData{

	private String title;

	@JsonProperty("category_id")
	private String categoryId;
	
	@JsonProperty("start_date")
	private String startDate;
	
	@JsonProperty("end_date")
	private String endDate;

	
	

	

}
