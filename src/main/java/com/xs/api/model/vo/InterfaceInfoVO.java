package com.xs.api.model.vo;

import com.xs.xsapicommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 接口信息封装视图
 *
 * @author xs
 * @TableName product
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo {

    /**
     * 统计调用次数
     */
    private Integer totalNum;

    private static final long serialVersionUID = 1L;
}