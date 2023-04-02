package io.fluentqa.logistics.model.zto;

import java.util.List;
import lombok.Data;

/**
 * 中通轨迹查询结果.

 */
@Data
public class ZhongtongResultV1 {

    /**
     * 数据.
     */
    private List<ZhongtongData> data;
    /**
     * 信息.
     */
    private String msg;
    /**
     * 是否成功.
     */
    private Boolean status;
    /**
     * 错误信息.
     */
    private String message;

}
