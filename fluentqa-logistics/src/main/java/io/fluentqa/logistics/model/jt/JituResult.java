package io.fluentqa.logistics.model.jt;

import lombok.Data;
/**
 * 极兔通用请求结果.
 */
@Data
public class JituResult<T> {
    /**
     * code.
     */
    private String code;
    /**
     * msg.
     */
    private String msg;
    /**
     * data.
     */
    private T data;

}
