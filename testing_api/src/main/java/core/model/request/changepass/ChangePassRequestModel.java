package core.model.request.changepass;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangePassRequestModel{


	@JsonProperty("old_pass")
	private String oldPass;
	
	@JsonProperty("new_pass")
	private String newPass;
	
	@JsonProperty("re_pass")
	private String rePass;
}
