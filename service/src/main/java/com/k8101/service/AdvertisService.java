package com.k8101.service;

import com.k8101.TAdvertisement;

import java.util.List;




public interface AdvertisService {

    boolean addAdver(TAdvertisement advertisement);

    List<TAdvertisement> getAll();

    

}
