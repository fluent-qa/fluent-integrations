package io.fluentqa.logistics.model.sf;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 顺丰轨迹查询请求结果.

 */
@Data
public class ShunfengResult {
    private String apiErrorMsg;

    @JSONField(name = "apiResponseID")
    private String apiResponseId;

    private String apiResultCode;

    private ApiResultData apiResultData;

    public void setApiResultData(String apiResultData) {

        this.apiResultData = JSON.parseObject(apiResultData, ApiResultData.class);
    }
}
