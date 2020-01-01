package com.hbgc.demo.controller;

import com.hbgc.demo.domain.Address;
import com.hbgc.demo.json.Json;
import com.hbgc.demo.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("address")
public class AddressController extends BaseController {
    @Resource
    private AddressService addressService;

    @GetMapping("query")
    public Map<String, Object> queryAllByAddress(String address){
        Address findAddress=null;
        try {
            findAddress=addressService.queryAllByAddress(address);
            if (findAddress!=null){
                return Json.success(findAddress,"查询成功！");
            }
            return Json.fail("暂无该地区信息！");
        }catch (Exception ex){
            ex.printStackTrace();
            return Json.fail("查询失败!");
        }
    }
}
