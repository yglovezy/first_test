package com.les.ch03mybatis.dao;

import com.les.ch03mybatis.bo.CityNumBo;
import com.les.ch03mybatis.bo.TbOrderBo;
import com.les.ch03mybatis.bo.TbUserBo;
import com.les.ch03mybatis.dto.updateOrderDto;
import com.les.ch03mybatis.entity.TbOrder;
import com.les.ch03mybatis.entity.TbUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface mysqlMapper {

    TbUser getuser(@Param("id") String id);

    TbOrder getOrder(@Param("id") String id);

    String getUserName(@Param("id") String id);

    List<TbUserBo> getAllUser();

    List<TbOrderBo> getAllOrder();

    boolean updateOrder(@Param("param") updateOrderDto updateOrderDto);

    boolean updateOrder1(@Param("id") String id, @Param("num") String num);

    boolean updatePrice(@Param("id") String id, @Param("price") String price);

    List<String> getCity(String pop);

    List<CityNumBo> getCityNum();


    List<TbOrderBo> getUserOrder(@Param("id") Long id);


    String getUserCost(@Param("id") Long id);

}
