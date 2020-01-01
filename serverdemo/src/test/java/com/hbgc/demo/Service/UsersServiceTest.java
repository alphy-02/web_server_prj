package com.hbgc.demo.Service;

import com.hbgc.demo.domain.Users;
import com.hbgc.demo.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.validation.constraints.Null;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersServiceTest {
    @Resource
    private UsersService usersService;


    @Test
    public void regTest() {
        Users u = new Users();
        u.setUsername("zhangsan");
        u.setPassword("123456");
        usersService.save(u);
        System.out.println("Save Success");
    }

    @Test
    public void loginTest() {
        Users u = new Users();
        u = usersService.login("zhangsan", "12345");
        if (u != null) {
            System.out.println("LoginSuccess");
        } else {
            System.out.println("LoginFailure");
        }
    }
}
