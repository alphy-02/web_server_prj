package com.hbgc.demo.repository;

import com.hbgc.demo.domain.Users;
import sun.security.util.Password;

public interface UsersRepository extends BaseRepository<Users, Integer> {

    Users findByUsernameAndPassword(String username, String Password);
}
