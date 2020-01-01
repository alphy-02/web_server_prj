package com.hbgc.demo.service.impl;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.hbgc.demo.domain.Users;
import com.hbgc.demo.repository.UsersRepository;
import com.hbgc.demo.service.UsersService;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends BaseServiceImpl<Users, Integer, UsersRepository> implements UsersService {
    @Override
    public Users login(String username, String password) {
        return super.dao.findByUsernameAndPassword(username, password);
    }
}
