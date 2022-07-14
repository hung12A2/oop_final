package core.model.response.contactus;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactUsData {
	
    private String name;
	
	private String phone;

	private String email;
	
	private String content;
	
	private String file; 
	
	private String report_type;
}
