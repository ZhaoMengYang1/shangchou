package com.k8101.service.impl;

import java.util.List;

import com.k8101.TAdvertisement;
import com.k8101.dao.TAdvertisementMapper;
import com.k8101.service.AdvertisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class AdvertisServiceImpl implements AdvertisService {

    @Autowired
    TAdvertisementMapper advertisementMapper;
    
    @Override
    public boolean addAdver(TAdvertisement advertisement) {
        // TODO Auto-generated method stub
        return advertisementMapper.insertSelective(advertisement)>0;
    }

    @Override
    public List<TAdvertisement> getAll() {
        // TODO Auto-generated method stub
        return advertisementMapper.selectByExample(null);
    }

  

}
