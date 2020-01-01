package com.hbgc.demo.Service;

import com.hbgc.demo.domain.Address;
import com.hbgc.demo.service.AddressService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressServiceTest {
    @Resource
    private AddressService addressService;

    @Test
    public void queryAllByAddress(){
        Address address=null;
        address=addressService.queryAllByAddress("云南省 丽江市");
        System.out.println(address);
    }
}
