package io.fluentqa.logistics.model.jt.route;

import io.fluentqa.logistics.constant.JituScanType;
import io.fluentqa.logistics.enums.ExpressStateEnum;
import io.fluentqa.logistics.model.ExpressData;
import io.fluentqa.logistics.utils.DateUtils;
import lombok.Data;


/**
 * 极兔路由轨迹信息.

 */
@Data
public class JituRouteItem extends ExpressData {
    public void setScanNetworkCity(String scanNetworkCity) {
        super.setAreaName(scanNetworkCity);
    }

    public void setScanTime(String scanTime) {
        super.setTime(DateUtils.strToTimestamp(scanTime));
        super.setFtime(scanTime);
    }

    public void setDesc(String desc) {
        super.setContext(desc);
    }

    /**
     * 处理路由状态.
     *
     * @param scanType 路由状态
     */
    public void setScanType(String scanType) {
        // 收件
        if (scanType.equals(JituScanType.COLLECTED)) {
            super.setStatus(ExpressStateEnum.COLLECTED.getValue());
            return;
        }
        // 已签收
        if (scanType.equals(JituScanType.SIGNED)
            || scanType.equals(JituScanType.OUT_STORAGE)) {
            super.setStatus(ExpressStateEnum.SIGNED.getValue());
            return;
        }
        // 代理收件
        if (scanType.equals(JituScanType.AGENT)) {
            super.setStatus(ExpressStateEnum.AGENT.getValue());
            return;
        }
        // 疑难
        if (scanType.equals(JituScanType.PROBLEM)) {
            super.setStatus(ExpressStateEnum.EXCEPTION.getValue());
            return;
        }

        super.setStatus(ExpressStateEnum.TRANSITING.getValue());
    }
    
}
