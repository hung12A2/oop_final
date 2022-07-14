package core.model.response.acceptmaxbid;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SellingInfoData {
	
	private String name;
	
	private String email;
	
	private String address;
	
	private String phone;
}	
