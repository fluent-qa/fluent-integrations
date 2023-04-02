package io.fluentqa.logistics.model.htky;

import java.util.List;
import lombok.Data;

/**
 * 流转信息.
 */
@Data
public class BaishiTrace {
    /**
     * 流转信息项.
     */
    private List<BaishiTraceItems> trace;

}
