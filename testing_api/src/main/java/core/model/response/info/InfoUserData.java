package core.model.response.info;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoUserData{
	
	
	private String name;
	
	private String phone;
	
	private String address;
	
	private String avatar;
	
	private int role;
	
	private String email;

	@JsonProperty("total_like")
	private int totalLike;

	@JsonProperty("total_auctions")
	private int totalAuctions;

}
