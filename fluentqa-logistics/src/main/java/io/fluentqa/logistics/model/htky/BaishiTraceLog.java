package io.fluentqa.logistics.model.htky;

import lombok.Data;

/**
 * 流转信息.
 *
 */
@Data
public class BaishiTraceLog {
    /**
     * 抽检标记.
     */
    private Boolean check;
    /**
     * 问题件.
     */
    private BaishiProblem problems;
    /**
     * 运单号.
     */
    private String mailNo;
    /**
     * 流转信息.
     */
    private BaishiTrace traces;

}
