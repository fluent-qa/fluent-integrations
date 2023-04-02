package io.fluentqa.logistics.model.jt.price;

import java.math.BigDecimal;

import io.fluentqa.logistics.model.ExpressPriceResult;
import lombok.Data;

/**
 * 极兔运费查询结果.
 *

 */
@Data
public class JituPriceResult extends ExpressPriceResult {

    public void setTotalPrice(BigDecimal totalPrice) {
        super.setPrice(totalPrice.setScale(2));
    }
}
