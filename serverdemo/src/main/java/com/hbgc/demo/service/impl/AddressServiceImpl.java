package com.hbgc.demo.service.impl;

import com.hbgc.demo.domain.Address;
import com.hbgc.demo.repository.AddressRepository;
import com.hbgc.demo.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl extends BaseServiceImpl<Address,Integer, AddressRepository> implements AddressService {
    @Override
    public Address queryAllByAddress(String address) {
        return super.dao.queryAllByAddress(address);
    }
}
