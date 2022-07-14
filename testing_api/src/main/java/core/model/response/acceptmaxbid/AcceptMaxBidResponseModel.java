package core.model.response.acceptmaxbid;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AcceptMaxBidResponseModel extends BaseResponseModel {
	
	private AcceptMaxBidData data;
	
	
}	