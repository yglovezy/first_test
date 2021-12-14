package com.les.ch03mybatis.dao;

import com.les.ch03mybatis.entity.Count;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {

    public Count getCount(String mlid);

}
