package com.hbgc.demo.service.impl;

import com.hbgc.demo.domain.Catlog;
import com.hbgc.demo.repository.CatlogRepository;
import com.hbgc.demo.service.CatlogService;
import org.springframework.stereotype.Service;

@Service
public class CatlogServiceImpl extends BaseServiceImpl<Catlog,Integer, CatlogRepository> implements CatlogService {
}
