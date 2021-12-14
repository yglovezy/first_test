package com.les.ch03mybatis.server;

import com.les.ch03mybatis.api.MySqlApi;
import com.les.ch03mybatis.bo.CityNumBo;
import com.les.ch03mybatis.bo.TbOrderBo;
import com.les.ch03mybatis.bo.TbUserBo;
import com.les.ch03mybatis.dao.mysqlMapper;
import com.les.ch03mybatis.dto.updateOrderDto;
import com.les.ch03mybatis.entity.TbUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class MySqlServer implements MySqlApi {
    @Autowired
    mysqlMapper mysqlMapper;

    @Override
    public String GetUserName(String id) {
        return mysqlMapper.getUserName(id);
    }

    @Override
    public TbUser GetUser(String id) {
        return mysqlMapper.getuser(id);
    }

    @Override
    public List<TbUserBo> GetAllUser() {
        return mysqlMapper.getAllUser();
    }

    @Override
    public List<TbOrderBo> GetAllOrder() {
        return mysqlMapper.getAllOrder();
    }

    @Override
    public boolean updateOrder(updateOrderDto updateOrderDto) {
        return mysqlMapper.updateOrder(updateOrderDto);
    }

    @Override
    public boolean updateOrder1(String id, String num) {
        return mysqlMapper.updateOrder1(id, num);
    }

    @Override
    public boolean updatePrice(String id, String price) {
        return mysqlMapper.updatePrice(id, price);
    }

    @Override
    public List<String> getCity(String pop) {
        return mysqlMapper.getCity(pop);
    }

    @Override
    public List<CityNumBo> getCityNum() {
        return mysqlMapper.getCityNum();
    }

    @Override
    public List<TbOrderBo> getUserOrder(Long id) {
        return mysqlMapper.getUserOrder(id);
    }

    @Override
    public String getUserCost(Long id) {
        String sql, result;
        String order = "";
        sql = mysqlMapper.getUserCost(id);
        result = "用户编号：" + id + mysqlMapper.getuser(Long.toString(id)).getUsername() + sql + "，所购商品为：";
        List<TbOrderBo> list = mysqlMapper.getUserOrder(id);
        for (int i = 0; i < list.size(); i++) {
            TbOrderBo orderBo = list.get(i);
            order += orderBo.getName() + "! ";
        }
        return result + order;
    }

}
