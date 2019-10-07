package com.k8101.service;

import com.k8101.TUser;
import com.k8101.TUserExample;

import java.util.List;




public interface UserService {

    boolean register(TUser user);

    TUser login(TUser user);

    //查询所有用户
    List<TUser> getAll();
    
    List<TUser> getAllByCondition(TUserExample example);

    void deleteBatchOrSingle(String ids);

    //发送忘记密码邮件
    boolean sendEmail(String email);
    
    //检查邮箱存在？  true：存在  false：不存在
    TUser checkEmailExist(String email);
    
    boolean updatePasswordByToken(String token, String pwd);

   
    

}
