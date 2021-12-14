package com.les.ch03mybatis.dao;

import com.les.ch03mybatis.dto.updateIdDto;
import com.les.ch03mybatis.entity.Count;
import org.apache.coyote.OutputBuffer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface queryMapper {
    public Count getCntById(String mlid);


    public Count getAllById(String mlid);

    public List<Count> getAllBuDomainid(String id);

    public Integer updateCntById(@Param("param") updateIdDto updateIdDto);


    public void insertCount(Count count);


    public void deleteCountById(String id);
}
