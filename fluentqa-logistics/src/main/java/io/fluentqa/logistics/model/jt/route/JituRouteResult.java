package io.fluentqa.logistics.model.jt.route;

import java.util.List;
import lombok.Data;

/**
 * 极兔路由查询结果.

 */
@Data
public class JituRouteResult {
    /**
     * 快递单号.
     */
    private String billCode;

    /**
     * 路由轨迹信息.
     */
    private List<JituRouteItem> details;
}
