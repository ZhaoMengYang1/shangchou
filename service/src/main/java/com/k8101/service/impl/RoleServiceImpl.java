package com.k8101.service.impl;

import java.util.List;

import com.k8101.TRole;
import com.k8101.dao.TRoleMapper;

import com.k8101.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class RoleServiceImpl implements RoleService {
    
    @Autowired
    TRoleMapper roleMapper;

    @Override
    public List<TRole> getAllRole() {
        // TODO Auto-generated method stub
       
        return  roleMapper.selectByExample(null);
    }

    @Override
    public List<TRole> getUserRole(Integer userId) {
        // TODO Auto-generated method stub
        return roleMapper.getUserRole(userId);
    }

}
