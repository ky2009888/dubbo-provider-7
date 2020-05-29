package com.order.dubbo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 功能描述:dubbo服务接口
 * 项目名称:order-dubbo
 * 创建日期:2020/5/28
 *
 * @author Lenovo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress implements Serializable {
    /**
     * ID。
     */
    private Integer id;
    /**
     * 用户地址.
     */
    private String userAddress;
    /**
     * 用户ID。
     */
    private String userId;
    /**
     * 收货人
     */
    private String consignee;
    /**
     * 用户号码.
     */
    private String phoneNum;
    /**
     * 是否默认.
     */
    private String isDefault;
}
