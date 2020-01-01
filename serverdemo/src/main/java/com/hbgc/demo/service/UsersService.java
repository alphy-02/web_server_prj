package com.hbgc.demo.service;

import com.hbgc.demo.domain.Users;
import com.hbgc.demo.repository.UsersRepository;

public interface UsersService extends BaseService<Users, Integer, UsersRepository> {
    public Users login(String username, String password);
}
