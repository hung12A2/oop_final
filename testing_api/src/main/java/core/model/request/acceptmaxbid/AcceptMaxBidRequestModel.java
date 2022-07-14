package core.model.request.acceptmaxbid;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AcceptMaxBidRequestModel {
	@JsonProperty("selling_info")
	private String sellingInfo;
	
	

}
