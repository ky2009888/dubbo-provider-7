package com.order.dubbo.service.impl;

import com.order.dubbo.bean.UserAddress;
import com.order.dubbo.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述:
 * 项目名称:order-dubbo
 * 创建日期:2020/5/28
 *
 * @author Lenovo
 */
public class UserServiceImpl implements UserService {
    /**
     * 根据用户id获取用户地址.
     *
     * @param userId 用户ID。
     * @return
     */
    @Override
    public List<UserAddress> optUserAddress(String userId) {
        return getUserAddresses(userId);
    }

    private List<UserAddress> getUserAddresses(String userId) {
        List<UserAddress> userAddressList = new ArrayList<>();
        UserAddress userAddress0 = new UserAddress(0, "南京路0号", "0", "韩梅梅", "13337719209", "0");
        UserAddress userAddress1 = new UserAddress(1, "南京路1号", "1", "李磊", "13337719201", "1");
        UserAddress userAddress2 = new UserAddress(2, "南京路2号", "2", "刘涛", "13337719202", "1");
        UserAddress userAddress3 = new UserAddress(3, "南京路3号", "3", "王大方", "13337719203", "0");
        if ("0".equals(userId)) {
            userAddressList.add(userAddress0);
            return userAddressList;
        }
        if ("1".equals(userId)) {
            userAddressList.add(userAddress1);
            return userAddressList;
        }
        if ("2".equals(userId)) {
            userAddressList.add(userAddress2);
            return userAddressList;
        }
        if ("3".equals(userId)) {
            userAddressList.add(userAddress3);
            return userAddressList;
        }
        return userAddressList;
    }
}
