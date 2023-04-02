package io.fluentqa.logistics.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 物流查询入参.
 */
@Data
public class ExpressBatchParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 快递公司官方简称.
     */
    private String expressCompanyNo;

    /**
     * 快递号.
     */
    private String[] expressNos;

    /**
     * 手机号.
     */
    private String mobile;

}
