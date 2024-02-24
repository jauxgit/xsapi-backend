package com.xs.api.model.dto.interfaceInfo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.xs.api.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询请求
 *
 * @author 小衫
 *  
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoQueryRequest extends PageRequest implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 接口名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求类型
     */
    private String method;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 接口状态 0 - 关闭 1 - 开启
     */
    private Integer status;

    /**
     * 创建人
     */
    private Long userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}