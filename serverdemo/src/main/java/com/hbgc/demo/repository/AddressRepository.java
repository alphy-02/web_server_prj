package com.hbgc.demo.repository;

import com.hbgc.demo.domain.Address;

public interface AddressRepository extends BaseRepository<Address,Integer> {
    Address queryAllByAddress(String address);
}
