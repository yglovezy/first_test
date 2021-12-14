package com.les.ch03mybatis.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * tb_user
 * @author 
 */
@Data
@TableName("TB_USER")
public class TbUser implements Serializable {
    private Long id;

    /**
     * 收件人
     */
    @TableField("USERNAME")
    private String username;

    /**
     * 地址
     */
    @TableField("ADDRESS")
    private String address;

    private static final long serialVersionUID = 1L;
}