package com.les.ch03mybatis.api;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.les.ch03mybatis.bo.TZtkMappingBo;
import com.les.ch03mybatis.dto.PageParamDto;
import com.les.ch03mybatis.dto.updateIdDto;
import com.les.ch03mybatis.entity.Count;
import javafx.scene.control.Pagination;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;
import sun.net.idn.Punycode;

import javax.validation.Valid;
import java.util.List;

public interface AccountApi {
    @GetMapping("/sql")
    public String queryFromDb();


    @GetMapping("acct/{id}")
    public Count getByMlid(@PathVariable("id") String mlid);

    @GetMapping("all/{id}")
    public Count getAllById(@PathVariable("id") String mlid);


    @GetMapping("ztk/{id}")
    public List<Count> getAllByZtk(@PathVariable("id") String id);

    @PutMapping("update")
//    @ResponseBody
    public Integer updateCnt(@RequestBody @Valid updateIdDto updateIdDto);


    @PostMapping("insert")
    public void insertCount(Count count);

    @DeleteMapping("delete/{id}")
    public void deleteCount(@PathVariable("id") String id);

    @GetMapping("selectall/{id}")
    public List<Count> selectAllCount(@PathVariable("id") String id);

    @GetMapping("page")
    public List<Count> getPage(@RequestBody PageParamDto paramDto);

    @GetMapping("mapping")
    public List<TZtkMappingBo> getAllMapping();


}
