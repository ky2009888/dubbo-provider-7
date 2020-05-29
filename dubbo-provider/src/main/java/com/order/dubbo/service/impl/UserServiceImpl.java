package com.order.dubbo.service.impl;

import com.order.dubbo.bean.UserAddress;
import com.order.dubbo.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������:
 * ��Ŀ����:order-dubbo
 * ��������:2020/5/28
 *
 * @author Lenovo
 */
public class UserServiceImpl implements UserService {
    /**
     * �����û�id��ȡ�û���ַ.
     *
     * @param userId �û�ID��
     * @return
     */
    @Override
    public List<UserAddress> optUserAddress(String userId) {
        return getUserAddresses(userId);
    }

    private List<UserAddress> getUserAddresses(String userId) {
        List<UserAddress> userAddressList = new ArrayList<>();
        UserAddress userAddress0 = new UserAddress(0, "�Ͼ�·0��", "0", "��÷÷", "13337719209", "0");
        UserAddress userAddress1 = new UserAddress(1, "�Ͼ�·1��", "1", "����", "13337719201", "1");
        UserAddress userAddress2 = new UserAddress(2, "�Ͼ�·2��", "2", "����", "13337719202", "1");
        UserAddress userAddress3 = new UserAddress(3, "�Ͼ�·3��", "3", "����", "13337719203", "0");
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
