package com.k8101.service;

import com.k8101.TPermission;

import java.util.List;




public interface TPermissionService {
    
    /**
     * 获取到所有菜单
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    public List<TPermission> getAllMenus();
    
    public List<TPermission> getPermissions();

    public List<TPermission> getRolePermission(Integer rid);

    public boolean updatePermission(String pids, Integer rid);

}
