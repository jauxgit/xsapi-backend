package com.xs.api.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xs.xsapicommon.model.entity.User;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户服务
 *
 * @author xs
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userName, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 是否为管理员
     *
     * @param request
     * @return
     */
    boolean isAdmin(HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 根据用户id更新ak/sk
     * @param id
     * @return
     */
    boolean getUpdateByAkSk(int id);

    /**
     * 用户修改密码
     * @param userAccount   用户账号
     * @param newPassword   修改的密码
     * @param userPassword  旧密码
     * @param checkPassword 确认新密码
     * @return  true：修改成功   false：修改失败
     */
    boolean userResetPassword(String userAccount, String newPassword, String userPassword, String checkPassword);
}
