package com.order.dubbo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ��������:dubbo����ӿ�
 * ��Ŀ����:order-dubbo
 * ��������:2020/5/28
 *
 * @author Lenovo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress implements Serializable {
    /**
     * ID��
     */
    private Integer id;
    /**
     * �û���ַ.
     */
    private String userAddress;
    /**
     * �û�ID��
     */
    private String userId;
    /**
     * �ջ���
     */
    private String consignee;
    /**
     * �û�����.
     */
    private String phoneNum;
    /**
     * �Ƿ�Ĭ��.
     */
    private String isDefault;
}
