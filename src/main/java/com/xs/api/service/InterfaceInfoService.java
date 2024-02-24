package com.xs.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xs.xsapicommon.model.entity.InterfaceInfo;

/**
* @author JAUX
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-09-30 16:58:10
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
