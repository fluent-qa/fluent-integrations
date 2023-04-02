package io.fluentqa.logistics.model;

import java.io.Serializable;

import io.fluentqa.logistics.constant.RequestConstant;
import lombok.Data;


/**
 * 物流查询入参.

 */
@Data
public class BaseParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private String format = RequestConstant.JSON;

    /**
     * 快递公司官方简称.
     */
    private String expressCompanyNo;

}