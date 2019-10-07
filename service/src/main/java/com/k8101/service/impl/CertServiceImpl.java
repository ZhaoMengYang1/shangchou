package com.k8101.service.impl;

import java.util.List;

import com.k8101.TCert;
import com.k8101.dao.TCertMapper;
import com.k8101.service.CertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class CertServiceImpl implements CertService {
    
    @Autowired
    TCertMapper certMapper;

    @Override
    public List<TCert> getAllCert() {
        // TODO Auto-generated method stub
        return certMapper.selectByExample(null);
    }

}
