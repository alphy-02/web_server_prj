package com.hbgc.demo.controller;

import com.hbgc.demo.domain.Users;
import com.hbgc.demo.json.Json;
import com.hbgc.demo.service.UsersService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("users")
public class UsersController extends BaseController {

    @Resource
    private UsersService usersService;

    @GetMapping("login2")
    public Map<String, Object> login2(String token, String username, String password, String validateCode) {
        Users loginUser = null;
        try {
            //先检查验证码.
            if (!redisTemplate.hasKey(token)) {
                return Json.fail("验证码不正确");
            }

            Integer redis_ValidateCode = (Integer) redisTemplate.opsForValue().get(token);

            if (redis_ValidateCode != Integer.valueOf(validateCode)) {
                return Json.fail("验证码不正确");
            }

            loginUser = usersService.login(username, password);
            if (loginUser != null) {
                return Json.success("登陆成功！");
            }
            return Json.fail("登录失败！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return Json.fail("登录失败！");
        }
    }


    @ApiOperation(value = "用户登录接口", notes = "URL传入用户名和密码执行登录操作")
    @ApiImplicitParam(name = "token", value = "token", required = true)
    @GetMapping("login")
    public Map<String, Object> login(String token, String username, String password, String validateCode) {
        Users loginUser = null;
        try {
            //先检查验证码.
            if (!redisTemplate.hasKey(token)) {
                return Json.fail("验证码不正确");
            }

            String redis_ValidateCode = (String) redisTemplate.opsForValue().get(token);

            if (!redis_ValidateCode.equals(validateCode)) {
                return Json.fail("验证码不正确");
            }

            loginUser = usersService.login(username, password);
            if (loginUser != null) {
                return Json.success(loginUser,"登陆成功！");
            }
            return Json.fail("登录失败！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return Json.fail("登录失败！");
        }
    }

    @ApiOperation(value = "用户注册接口", notes = "URL传入用户名和密码执行注册操作")
//    @ApiImplicitParam(name = "token",value = "token",required = true)
    @PostMapping("reg")
    public Map<String, Object> reg(String token, @RequestBody Users user) {
        try {

            if (!checkValidateCode(token, user.getValidateCode())) {
                return Json.fail("验证码不正确！");
            }

            usersService.save(user);
            return Json.success(null, "注册成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return Json.fail("注册失败!");
        }
    }
}
