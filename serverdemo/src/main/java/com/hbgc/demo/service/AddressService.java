package com.hbgc.demo.service;

import com.hbgc.demo.domain.Address;
import com.hbgc.demo.repository.AddressRepository;


public interface AddressService extends BaseService<Address,Integer, AddressRepository> {
    public Address queryAllByAddress(String address);
}
