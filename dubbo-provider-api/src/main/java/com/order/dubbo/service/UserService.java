package com.order.dubbo.service;

import com.order.dubbo.bean.UserAddress;

import java.util.List;

/**
 * ��������:�û��ӿ�
 * ��Ŀ����:order-dubbo
 * ��������:2020/5/28
 *
 * @author Lenovo
 */
public interface UserService {
    /**
     * �����û�id��ȡ�û���ַ.
     *
     * @param userId �û�ID��
     * @return
     */
    List<UserAddress> optUserAddress(String userId);
}
