package com.xs.api.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户aksk视图
 */
@Data
public class UserAKVo implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * ak
     */
    private String accessKey;

    /**
     * sk
     */
    private String secretKey;

    private static final long serialVersionUID = 1L;
}
