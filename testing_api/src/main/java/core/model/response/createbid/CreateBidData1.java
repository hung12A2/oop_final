package core.model.response.createbid;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBidData1 extends CreateBidData {
	private String total;
}
