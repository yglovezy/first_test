package com.les.ch03mybatis.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class TbUserBo {
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
}
