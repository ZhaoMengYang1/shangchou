package com.k8101.dao;

import com.k8101.TAccountTypeCert;
import com.k8101.TAccountTypeCertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAccountTypeCertMapper {
    long countByExample(TAccountTypeCertExample example);
    // 李四
    List<TAccountTypeCert> FindAll(TAccountTypeCertExample example);
    int findall();
    int deleteByExample(TAccountTypeCertExample example);


    int deleteByPrimaryKey(Integer id);

    int insert(TAccountTypeCert record);

    int insertSelective(TAccountTypeCert record);

    List<TAccountTypeCert> selectByExample(TAccountTypeCertExample example);

    TAccountTypeCert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAccountTypeCert record, @Param("example") TAccountTypeCertExample example);

    int updateByExample(@Param("record") TAccountTypeCert record, @Param("example") TAccountTypeCertExample example);

    int updateByPrimaryKeySelective(TAccountTypeCert record);

    int updateByPrimaryKey(TAccountTypeCert record);
}