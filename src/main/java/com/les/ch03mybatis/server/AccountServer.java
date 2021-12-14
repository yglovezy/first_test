package com.les.ch03mybatis.server;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.les.ch03mybatis.api.AccountApi;
import com.les.ch03mybatis.bo.TZtkMappingBo;
import com.les.ch03mybatis.dao.AccountMapper;
import com.les.ch03mybatis.dao.TZtkMappingMapper;
import com.les.ch03mybatis.dao.mybatisplusMapper;
import com.les.ch03mybatis.dao.queryMapper;
import com.les.ch03mybatis.dto.PageParamDto;
import com.les.ch03mybatis.dto.updateIdDto;
import com.les.ch03mybatis.entity.Count;
import com.les.ch03mybatis.service.impl.dqfwmlServiceImpl;
import com.les.ch03mybatis.service.mybatisplusService;
import javafx.scene.control.Pagination;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
@RestController
//@Controller
public class AccountServer implements AccountApi {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    AccountServer accountServer;

    @Autowired
    dqfwmlServiceImpl dqfwmlService;
    @Autowired
    queryMapper queryMapper;
    @Autowired
    mybatisplusService mybatisplusService;

    @Autowired
    TZtkMappingMapper tZtkMappingMapper;

//
//    @Autowired
//    mybatisplusMapper mybatisplusMapper;

    @ResponseBody
    @Override
    public String queryFromDb() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from T_ZTK_DATACOUNT ", Long.class);
        return aLong.toString();
    }

    @Override
    public Count getByMlid(String mlid) {
        return dqfwmlService.getCntById(mlid);
    }

    @Override
    public Count getAllById(String mlid) {
        return dqfwmlService.getAllById(mlid);
    }

    @Override
    public List<Count> getAllByZtk(String id) {
        return dqfwmlService.getAllByZtk(id);
    }

    public Integer updateCnt(updateIdDto updateIdDto) {
        return dqfwmlService.updateCntById(updateIdDto);
    }

    @Override
    public void insertCount(Count count) {
        queryMapper.insertCount(count);
    }

    @Override
    public void deleteCount(String id) {
        queryMapper.deleteCountById(id);
    }

    @Override
    public List<Count> selectAllCount(String id) {
        QueryWrapper<Count> countQueryWrapper = new QueryWrapper<Count>();
        countQueryWrapper.eq("domainid", id);
//
//        List<Count> list = mybatisplusMapper.selectList(countQueryWrapper);
//        List<Count> list = mybatisplusService.list();
//        int count = mybatisplusService.count();
//        System.out.println(count);
        List<Count> list = mybatisplusService.list(countQueryWrapper);


        return list;


    }

    @Override
    public List<Count> getPage(PageParamDto paramDto) {
        Page<Count> page = new Page<>(paramDto.getPn(), 5);
        QueryWrapper<Count> countQueryWrapper = new QueryWrapper<Count>();
        countQueryWrapper.eq("domainid", paramDto.getId());
        Page<Count> page1 = mybatisplusService.page(page, countQueryWrapper);
        List<Count> records = page1.getRecords();
//        Pagination<Count> pagination = new Pagination<Count>(page1);
        return records;
    }

    @Override
    public List<TZtkMappingBo> getAllMapping() {
        return tZtkMappingMapper.selectAll();
    }

    @GetMapping("file1")
    public String uploadFile() {


        return "file";
    }

    @PostMapping("input")
    public String inPut(@RequestParam("username") String name,
                        @RequestPart("photo") MultipartFile photo,
                        @RequestPart("photos") MultipartFile[] photos) throws IOException {

        log.info("上传的信息：name={},photo={},photos={}",
                name, photo.getOriginalFilename(),
                photos.length);

        if (!photo.isEmpty()) {
            photo.transferTo(new File("F:\\cache\\" + photo.getOriginalFilename()));
        }
        if (photos.length > 0) {
            for (MultipartFile file : photos) {
                if (!file.isEmpty()) {
                    file.transferTo(new File("F:\\cache\\" + file.getOriginalFilename()));
                }
            }
        }
        return "file";
    }


}
