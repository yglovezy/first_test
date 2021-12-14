package com.les.ch03mybatis.service;

import com.les.ch03mybatis.dto.updateIdDto;
import com.les.ch03mybatis.entity.Count;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface dqfwmlService {

    public Count getCntById(String id);

    public Count getAllById(String id);


    public List<Count> getAllByZtk(String id);

    public Integer updateCntById(updateIdDto updateIdDto);

}
