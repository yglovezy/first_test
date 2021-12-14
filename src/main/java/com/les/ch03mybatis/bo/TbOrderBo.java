package com.les.ch03mybatis.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.les.ch03mybatis.entity.TbUser;
import lombok.Data;

import java.io.Serializable;

/**
 * tb_order
 *
 * @author
 */
@Data
@TableName("TB_ORDER")
public class TbOrderBo implements Serializable {
    /**
     * 订单id
     */
    @TableField("ID")
    private Long id;

    /**
     * 用户id
     */
    @TableField("USERID")
    private Long userId;

    /**
     * 商品名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 商品价格
     */
    @TableField("PRICE")
    private Long price;

    /**
     * 商品数量
     */
    @TableField("NUM")
    private Integer num;

    private String username;
    private String address;

    private static final long serialVersionUID = 1L;
}