package io.fluentqa.logistics.model.sto;

import lombok.Data;

/**
 * 申通轨迹查询结果.
 *
 */
@Data
public class ShentongBaseResult {
    /**
     * 是否成功.
     */
    private Boolean success;
    /**
     * 错误编码.
     */
    private String errorCode;
    /**
     * 错误信息.
     */
    private String errorMsg;

}
