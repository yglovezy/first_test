package com.les.ch03mybatis.api;

import com.les.ch03mybatis.bo.CityNumBo;
import com.les.ch03mybatis.bo.TbOrderBo;
import com.les.ch03mybatis.bo.TbUserBo;
import com.les.ch03mybatis.dto.updateOrderDto;
import com.les.ch03mybatis.entity.TbOrder;
import com.les.ch03mybatis.entity.TbUser;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface MySqlApi {

    @GetMapping("username/{id}")
    String GetUserName(@PathVariable("id") String id);

    @GetMapping("user/{id}")
    TbUser GetUser(@PathVariable("id") String id);

    @GetMapping("user/all")
    List<TbUserBo> GetAllUser();

    @GetMapping("order/all")
    List<TbOrderBo> GetAllOrder();

    @PostMapping("order/update")
    boolean updateOrder(@RequestBody updateOrderDto updateOrderDto);

    @PostMapping("order/update1/{id}/{num}")
    boolean updateOrder1(@PathVariable("id") String id, @PathVariable("num") String num);

    @PostMapping("order/price")
    boolean updatePrice(@RequestParam("id") String id, @RequestParam("price") String price);

    @GetMapping("sql/city")
    List<String> getCity(@RequestParam("pop") String pop);

    @GetMapping("sql/citynum")
    List<CityNumBo> getCityNum();


    @GetMapping("sql/userorder/{id}")
    List<TbOrderBo> getUserOrder(@PathVariable("id") Long id);


    @GetMapping("sql/usercost/{id}")
    String getUserCost(@PathVariable("id") Long id);
}
