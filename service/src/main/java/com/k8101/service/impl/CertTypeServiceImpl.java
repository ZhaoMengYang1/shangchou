package com.k8101.service.impl;

import java.util.List;

import com.k8101.TAccountTypeCert;
import com.k8101.dao.TAccountTypeCertMapper;
import com.k8101.service.CertTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class CertTypeServiceImpl implements CertTypeService {
    
    @Autowired
    TAccountTypeCertMapper mapper;

    @Override
    public List<TAccountTypeCert> getAll() {
        // TODO Auto-generated method stub
        return mapper.selectByExample(null);
    }

}
