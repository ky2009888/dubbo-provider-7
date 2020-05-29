package com.order.dubbo.service;

import com.order.dubbo.bean.UserAddress;

import java.util.List;

/**
 * 功能描述:用户接口
 * 项目名称:order-dubbo
 * 创建日期:2020/5/28
 *
 * @author Lenovo
 */
public interface UserService {
    /**
     * 根据用户id获取用户地址.
     *
     * @param userId 用户ID。
     * @return
     */
    List<UserAddress> optUserAddress(String userId);
}
