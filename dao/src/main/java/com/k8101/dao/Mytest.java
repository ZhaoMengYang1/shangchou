package com.k8101.dao;

import com.k8101.TUser;
import com.k8101.TUserExample;

import java.util.List;

public class Mytest implements TUserMapper {
    public static void main(String[] args) {
int a;
    }


    @Override
    public long countByExample(TUserExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(TUserExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(TUser record) {
        return 0;
    }

    @Override
    public int insertSelective(TUser record) {
        return 0;
    }

    @Override
    public List<TUser> selectByExample(TUserExample example) {
        return null;
    }

    @Override
    public TUser selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(TUser record, TUserExample example) {
        return 0;
    }

    @Override
    public int updateByExample(TUser record, TUserExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(TUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TUser record) {
        return 0;
    }
}
