package com.hbgc.demo.Service;

import com.hbgc.demo.domain.Catlog;
import com.hbgc.demo.service.CatlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CatlogTest {
    @Resource
    private CatlogService catlogService;

    @Test
    public void findAll(){
        List<Catlog> catlogList=null;
        catlogList=catlogService.findAll();
        for(Catlog c:catlogList){
            System.out.println(c);
        }
    }
}
