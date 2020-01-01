package com.hbgc.demo.controller;

import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

public class BaseController {

    @Resource
    protected RedisTemplate redisTemplate;

    protected boolean checkValidateCode(String token, String validateCode) {
        if (!redisTemplate.hasKey(token)) {
            return false;
        }

        String redis_ValidateCode = (String) redisTemplate.opsForValue().get(token);
        if (!redis_ValidateCode.equals(validateCode)) {
            return false;
        }
        return true;
    }
}
