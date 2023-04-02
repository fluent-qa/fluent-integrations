package io.fluentqa.logistics.model.sto;

import io.fluentqa.logistics.constant.ShentongScanType;
import io.fluentqa.logistics.enums.ExpressStateEnum;
import io.fluentqa.logistics.model.ExpressData;
import io.fluentqa.logistics.utils.DateUtils;
import lombok.ToString;


/**
 * 路由信息.

 */
@ToString
public class ShentongRoute extends ExpressData {
    private static final long serialVersionUID = 1L;

    public void setOpOrgCityName(String opOrgCityName) {
        super.setAreaName(opOrgCityName);
    }

    public void setOpTime(String opTime) {
        super.setTime(DateUtils.strToTimestamp(opTime));
        super.setFtime(opTime);
    }

    /**
     * 处理轨迹信息.
     *
     * @param memo 轨迹信息
     */
    public void setMemo(String memo) {
        super.setContext(memo);
    }

    /**
     * 处理路由状态.
     *
     * @param scanType 路由状态
     */
    public void setScanType(String scanType) {
        // 收件
        if (scanType.equals(ShentongScanType.COLLECTED)) {
            super.setStatus(ExpressStateEnum.COLLECTED.getValue());
            return;
        }
        // 已签收
        if (scanType.equals(ShentongScanType.SIGNED)) {
            super.setStatus(ExpressStateEnum.SIGNED.getValue());
            return;
        }
        // 正在派送途中
        if (scanType.equals(ShentongScanType.DELIVERING)) {
            super.setStatus(ExpressStateEnum.DELIVERING.getValue());
            return;
        }
        // 代理收件
        if (scanType.equals(ShentongScanType.AGENT)) {
            super.setStatus(ExpressStateEnum.AGENT.getValue());
            return;
        }
        super.setStatus(ExpressStateEnum.TRANSITING.getValue());
    }
}
