package com.k8101.service;

import com.k8101.TRole;

import java.util.List;



public interface RoleService {

    List<TRole> getAllRole();

    List<TRole> getUserRole(Integer userId);

}
