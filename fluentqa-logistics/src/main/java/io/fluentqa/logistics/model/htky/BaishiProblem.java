package io.fluentqa.logistics.model.htky;

import java.util.List;
import lombok.Data;

/**
 * 问题件.

 */
@Data
public class BaishiProblem {

    /**
     * 问题信息.
     */
    private List<BaishiProblemItems> problem;
    /**
     * 运单号.
     */
    private String mailNo;

}
