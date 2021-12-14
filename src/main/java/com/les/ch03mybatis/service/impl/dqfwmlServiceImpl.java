package com.les.ch03mybatis.service.impl;

import com.les.ch03mybatis.dao.queryMapper;
import com.les.ch03mybatis.dto.updateIdDto;
import com.les.ch03mybatis.entity.Count;
import com.les.ch03mybatis.service.dqfwmlService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class dqfwmlServiceImpl implements dqfwmlService {

    @Autowired
    queryMapper queryMapper;

    @Override
    public Count getCntById(String id) {

        return queryMapper.getCntById(id);
    }

    @Override
    public Count getAllById(String id) {
        return queryMapper.getAllById(id);
    }

    @Override
    public List<Count> getAllByZtk(String id) {
        return queryMapper.getAllBuDomainid(id);
    }

    @Override
    public Integer updateCntById(updateIdDto updateIdDto) {
        return queryMapper.updateCntById(updateIdDto);

    }
}
