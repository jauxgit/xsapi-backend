package com.xs.api.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xs.xsapicommon.model.entity.UserInterfaceInfo;

/**
* @author JAUX
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-10-09 21:04:26
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    /**
     * 参数校验
     * @param userInterfaceInfo
     * @param add
     */
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);



    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
