package com.les.ch03mybatis.server;

import com.les.ch03mybatis.dao.mysqlMapper;
import com.les.ch03mybatis.entity.TbOrder;
import com.les.ch03mybatis.entity.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MysqlController {
    @Autowired
    mysqlMapper mysqlMapper;

    @Value("${person.name:lisi}")
    private String name;

    @GetMapping("/name")
    public String hello() {
        return "hello " + name;

    }

    @GetMapping("/sqlname/{id}")
    public TbUser getNameById(@PathVariable("id") String id) {
        return mysqlMapper.getuser(id);
    }

    @GetMapping("/sqlorder/{id}")
    public TbOrder getOrderById(@PathVariable("id") String id) {
        return mysqlMapper.getOrder(id);
    }

}
