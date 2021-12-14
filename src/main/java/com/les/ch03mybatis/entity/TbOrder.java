package com.les.ch03mybatis.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * tb_order
 * @author 
 */
@Data
@TableName("TB_ORDER")
public class TbOrder implements Serializable {
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

    private static final long serialVersionUID = 1L;
}