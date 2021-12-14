package com.les.ch03mybatis.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * T_ZTK_MAPPING
 *
 * @author
 */
@Data
public class TZtkMappingBo implements Serializable {
    /**
     * 用四位英文代码+下划线+guid代表不同主题库或者订阅。例如：GCJS_{GUID}代表是工程建设的配置
     */
    private String mappingid;

    /**
     * 主题库ID
     */
    private String domainid;

    /**
     * 服务目录ID
     */
    private String mlid;

    /**
     * 0-单表数据源，1-多表数据源，2-特殊数据源-SQL语句，3-特殊数据源-存储过程
     */
    private String mappingtype;

    /**
     * 源目录ID,多个以逗号分隔
     */
    private String mlidSrc;

    /**
     * (冗余字段)源目录名,多个以逗号分隔
     */
    private String mlnameSrc;

    /**
     * 数据源表名,多个以逗号分隔
     */
    private String tablenameSrc;

    /**
     * 多表数据来源时的表连接，如果有多个连接使用分号分隔
     */
    private String tablejoin;

    /**
     * 多表关联时的主表，用于增量
     */
    private String maintable;

    /**
     * 自定义条件
     */
    private String usercondition;

    /**
     * 1：修改过 0：未修改
     */
    private String ismodified;

    /**
     * 配置名称
     */
    private String sqldesc;

    /**
     * 存储过程名称
     */
    private String pname;

    /**
     * 是否启用 1:启用，0：禁用
     */
    private String isuse;

    /**
     * 是否全量 1：全量 0:业务增量 2批次增量
     */
    private String isall;

    /**
     * 排序
     */
    private BigDecimal orderid;

    /**
     * 创建人
     */
    private String createuser;

    /**
     * 更新人
     */
    private String updateuser;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 数据库资源ID 外键
     */
    private String sjkzyid;

    /**
     * 是否手动关联目录:1手动关联，0自动关联
     */
    private String ishandml;

    /**
     * 归档方式（默认为空，不抽取归档数据，非空则抽取归档数据）
     */
    private String gdtype;

    /**
     * 数据语句
     */
    private String datasql;
    private String DOMAINNAME;
    private static final long serialVersionUID = 1L;
}