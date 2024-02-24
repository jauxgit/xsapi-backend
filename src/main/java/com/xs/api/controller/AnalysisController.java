package com.xs.api.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xs.api.annotation.AuthCheck;
import com.xs.api.common.BaseResponse;
import com.xs.api.common.ErrorCode;
import com.xs.api.common.ResultUtils;
import com.xs.api.constant.UserConstant;
import com.xs.api.exception.BusinessException;
import com.xs.api.mapper.UserInterfaceInfoMapper;
import com.xs.api.model.vo.InterfaceInfoVO;
import com.xs.api.service.InterfaceInfoService;
import com.xs.xsapicommon.model.entity.InterfaceInfo;
import com.xs.xsapicommon.model.entity.UserInterfaceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 分析控制器
 */
@RestController
@RequestMapping("/analysis")
@Slf4j
public class AnalysisController {

    @Resource
    private UserInterfaceInfoMapper userInterfaceInfoMapper;

    @Resource
    private InterfaceInfoService interfaceInfoService;

    @GetMapping("/top/interface/invoke")
    @AuthCheck(mustRole = UserConstant.ADMIN_ROLE)
    public BaseResponse<List<InterfaceInfoVO>> listTopInvokeInterfaceInfo() {
        List<UserInterfaceInfo> userInterfaceInfos = userInterfaceInfoMapper.listTopInvokeInterfaceInfo(3);
        Map<Long, List<UserInterfaceInfo>> interfaceInfoIdObjMap = userInterfaceInfos.stream().collect(
                Collectors.groupingBy(UserInterfaceInfo::getInterfaceInfoId)
        );
        QueryWrapper<InterfaceInfo> infoQueryWrapper = new QueryWrapper<>();
        infoQueryWrapper.in("id", interfaceInfoIdObjMap.keySet());
        List<InterfaceInfo> interfaceInfoList = interfaceInfoService.list(infoQueryWrapper);
        if (CollectionUtils.isEmpty(interfaceInfoList)) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR);
        }
        List<InterfaceInfoVO> interfaceInfoVos = interfaceInfoList.stream().map(interfaceInfo -> {
            InterfaceInfoVO interfaceInfoVO = new InterfaceInfoVO();
            BeanUtils.copyProperties(interfaceInfo, interfaceInfoVO);
            Integer totalNum = interfaceInfoIdObjMap.get(interfaceInfo.getId()).get(0).getTotalNum();
            interfaceInfoVO.setTotalNum(totalNum);
            return interfaceInfoVO;
        }).collect(Collectors.toList());
        return ResultUtils.success(interfaceInfoVos);
    }

}
