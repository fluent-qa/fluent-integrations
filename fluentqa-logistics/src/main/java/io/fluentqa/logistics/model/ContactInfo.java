package io.fluentqa.logistics.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 收寄人信息.
 */
@Data
public class ContactInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公司名.
     */
    private String company;
    /**
     * 联系人姓名.
     */
    private String contact;

    /**
     * 邮编.
     */
    private String postCode;

    /**
     * 省.
     */
    private String province;
    /**
     * 市.
     */
    private String city;

    /**
     * 区.
     */
    private String county;
    /**
     * 详细地址.
     */
    private String address;
    /**
     * 电话.
     */
    private String tel;

}
