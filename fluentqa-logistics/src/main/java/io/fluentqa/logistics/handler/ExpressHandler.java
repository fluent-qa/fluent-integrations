package io.fluentqa.logistics.handler;

import io.fluentqa.logistics.model.*;

import java.util.List;


/**
 * 业务处理接口.

 */
public interface ExpressHandler {

    /**
     * 查询轨迹信息.
     *
     * @param expressParam 快递号、手机、快递公司编码
     * @return 查询接口
     */
    ExpressResponse<List<ExpressResult>> getExpressInfo(ExpressParam expressParam);

    /**
     * 运费预估.
     *
     * @param expressPriceParam 起始省份、起始城市、目的身份、目的城市、重量、长、宽、高
     * @return 运费
     */
    ExpressResponse<ExpressPriceResult> getExpressPrice(ExpressPriceParam expressPriceParam);

    /**
     * 创建订单.
     *
     * @param createOrderParam 下单参数，主要包含物品信息、收件人信息、寄件人信息等
     * @return 快递单号等信息
     */
    ExpressResponse<OrderResult> createOrder(CreateOrderParam createOrderParam);

    /**
     * 获取当前快递公司编码.
     *
     * @return 快递公司编码
     */
    String getExpressCompanyCode();
}