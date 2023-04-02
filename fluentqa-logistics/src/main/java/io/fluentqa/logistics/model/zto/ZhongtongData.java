package io.fluentqa.logistics.model.zto;

import java.util.List;
import lombok.Data;

/**
 * 中通轨迹查询数据.

 */
@Data
public class ZhongtongData {
    /**
     * 路由信息.
     */
    private List<ZhongtongTraceV1> traces;
    /**
     * 快递号.
     */
    private String billCode;

    /**
     * 扫描类型.
     */
    private String scanType;

    /**
     * 扫描时间(ms).
     */
    private Long scanDate;

}
