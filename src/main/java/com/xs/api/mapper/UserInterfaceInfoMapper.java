package com.xs.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xs.xsapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author JAUX
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-10-09 21:04:26
* @Entity com.xs.api.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    /**
     *
     * @param limit
     * @return
     */
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




