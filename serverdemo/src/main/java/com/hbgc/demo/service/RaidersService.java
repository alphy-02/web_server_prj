package com.hbgc.demo.service;

import com.hbgc.demo.domain.Raiders;
import com.hbgc.demo.repository.RaidersRepository;

import java.util.List;

public interface RaidersService extends BaseService<Raiders,Integer, RaidersRepository> {
    public List<Raiders> findAllByAddress(String address);
}
