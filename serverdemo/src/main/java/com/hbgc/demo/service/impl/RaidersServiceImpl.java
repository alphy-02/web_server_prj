package com.hbgc.demo.service.impl;

import com.hbgc.demo.domain.Raiders;
import com.hbgc.demo.repository.RaidersRepository;
import com.hbgc.demo.service.RaidersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaidersServiceImpl extends BaseServiceImpl<Raiders,Integer, RaidersRepository> implements RaidersService {
    @Override
    public List<Raiders> findAllByAddress(String address) {
        return super.dao.findAllByAddress(address);
    }
}
