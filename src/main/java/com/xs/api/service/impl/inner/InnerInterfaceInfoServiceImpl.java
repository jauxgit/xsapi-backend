package com.xs.api.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xs.api.common.ErrorCode;
import com.xs.api.exception.BusinessException;
import com.xs.api.mapper.InterfaceInfoMapper;
import com.xs.xsapicommon.model.entity.InterfaceInfo;
import com.xs.xsapicommon.service.InnerInterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author JAUX
 */
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        if (StringUtils.isAllBlank(url, method)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<InterfaceInfo> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("url", url);
        userQueryWrapper.eq("method", method);
        return interfaceInfoMapper.selectOne(userQueryWrapper);
    }
}
