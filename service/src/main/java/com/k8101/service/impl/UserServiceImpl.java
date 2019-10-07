package com.k8101.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.k8101.TUser;
import com.k8101.TUserExample;
import com.k8101.dao.TRoleMapper;
import com.k8101.dao.TUserMapper;
import com.k8101.dao.TUserTokenMapper;
import com.k8101.service.UserService;
import org.apache.commons.codec.digest.Md5Crypt;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    TUserMapper userMapper;
    @Autowired
    TRoleMapper roleMapper;
    @Override
    public boolean register(TUser user) {
        return false;
    }

    @Override
    public TUser login(TUser user) {
        return null;
    }

    @Override
    public List<TUser> getAll() {
        return null;
    }

    @Override
    public List<TUser> getAllByCondition(TUserExample example) {
        return null;
    }

    @Override
    public void deleteBatchOrSingle(String ids) {

    }

    @Override
    public boolean sendEmail(String email) {
        return false;
    }

    @Override
    public TUser checkEmailExist(String email) {
        return null;
    }

    @Override
    public boolean updatePasswordByToken(String token, String pwd) {
        return false;
    }
}
