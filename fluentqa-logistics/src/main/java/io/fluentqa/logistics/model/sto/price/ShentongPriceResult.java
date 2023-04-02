package io.fluentqa.logistics.model.sto.price;

import io.fluentqa.logistics.model.sto.ShentongBaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 申通运费预估结果.

 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ShentongPriceResult extends ShentongBaseResult {

    private ShentongPriceData data;

}
