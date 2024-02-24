package com.xs.api.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author xs
 */
@Data
public class IDRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}