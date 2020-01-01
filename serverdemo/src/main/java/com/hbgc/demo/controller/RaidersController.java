package com.hbgc.demo.controller;


import com.hbgc.demo.domain.Raiders;
import com.hbgc.demo.json.Json;
import com.hbgc.demo.service.RaidersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("raiders")
public class RaidersController extends BaseController {

    @Resource
    private RaidersService raidersService;

    @PostMapping("save")
    public Map<String,Object> save(@RequestBody Raiders raiders){
        try {
            raidersService.save(raiders);
            return Json.success(null,"发表攻略成功!");
        }catch (Exception ex){
            ex.printStackTrace();
            return Json.fail("发表攻略失败！");
        }
    }


    @GetMapping("findAll")
    public Map<String,Object> findAllByAddress(String address){
        try {
            List<Raiders> raidersList=null;
            raidersList=raidersService.findAllByAddress(address);
            if (raidersList!=null){
                return Json.success(raidersList,"查询成功！");
            }
            return Json.fail("该攻略不存在！");
        }catch (Exception ex){
            ex.printStackTrace();
            return Json.fail("查询失败！");
        }
    }

    @GetMapping("findAllById")
    public Map<String,Object> findAllById(int id){
        try {
            Raiders raiders=raidersService.getOne(id);
            if (raiders!=null){
                return Json.success(raiders,"查询成功！");
            }
            return Json.fail("该攻略不存在！");
        }catch (Exception ex){
            ex.printStackTrace();
            return Json.fail("查询失败！");
        }
    }
}
