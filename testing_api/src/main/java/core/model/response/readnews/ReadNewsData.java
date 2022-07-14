package core.model.response.readnews;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReadNewsData {
	
	@JsonProperty("is_read")
	private String isRead; 
	
	@JsonProperty("new_id")
	private String newId;
	 
	private String content;
	
	@JsonProperty("user_id")
	private String userId;
	
	private String title;
	
	@JsonProperty("updatedAt")
	private String updated_at;
	
	@JsonProperty("user_create_name")
	private String usercreateName;
	
	
	
	
	
	
	
	
	
	
	
	
}



