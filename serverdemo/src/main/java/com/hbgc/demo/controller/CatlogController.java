package com.hbgc.demo.controller;

import com.hbgc.demo.domain.Catlog;
import com.hbgc.demo.json.Json;
import com.hbgc.demo.service.CatlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("catlog")
public class CatlogController extends BaseController {

    @Resource
    private CatlogService catlogService;


    @GetMapping("/")
    public Map<String,Object> findAll(){
        List<Catlog> catlogList=null;
        try {
            catlogList=catlogService.findAll();
            return Json.success(catlogList,"查询成功！");
        }catch (Exception ex){
            ex.printStackTrace();
            return Json.fail("查询失败!");
        }
    }

}
