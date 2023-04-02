package io.fluentqa.logistics.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 下单参数.
 */
@Data
public class CreateOrderParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物品信息.
     */
    private CargoDetail cargoDetail;

    /**
     * 发件人信息.
     */
    private ContactInfo sendContactInfo;

    /**
     * 收件人信息.
     */
    private ContactInfo receiptContactInfo;

    /**
     * 手机号.
     */
    private String orderId;

}
