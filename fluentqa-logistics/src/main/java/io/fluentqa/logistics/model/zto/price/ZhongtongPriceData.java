package io.fluentqa.logistics.model.zto.price;

import lombok.Data;

/**
 * 中通运费估算数据.
 */
@Data
public class ZhongtongPriceData {

    /**
     * 运费.
     */
    private String price;
    /**
     * 时效.
     */
    private String hour;

}
