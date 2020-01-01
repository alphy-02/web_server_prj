package com.hbgc.demo.repository;

import com.hbgc.demo.domain.Raiders;

import java.util.List;

public interface RaidersRepository extends BaseRepository<Raiders,Integer> {
    List<Raiders> findAllByAddress(String address);
}
