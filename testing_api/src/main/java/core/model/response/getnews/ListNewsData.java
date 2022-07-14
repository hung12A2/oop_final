package core.model.response.getnews;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListNewsData {
	private String user;
	
	@JsonProperty("new_id")
	private String newId;
	
	private String title;
	
	private String content;
	
	@JsonProperty("updatedAt")
	private String updated_at;
	
	@JsonProperty("is_read")
	private String isRead;
}



