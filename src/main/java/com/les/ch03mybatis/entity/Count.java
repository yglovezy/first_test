package com.les.ch03mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("T_ZTK_DATACOUNT")
public class Count {

    @TableField("DOMAINID")
    private String domainid;
    @TableId("MLID")
    private String mlid;
    @TableField("DATACOUNT")
    private Integer datacount;
    @TableField("UPDATETIME")
    private Date updatetime;



}
