package core.model.response.info;


import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoResponseModel extends BaseResponseModel {
    private InfoUserData data;
}
