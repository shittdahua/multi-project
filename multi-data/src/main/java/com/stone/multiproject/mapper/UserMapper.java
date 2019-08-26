package com.stone.multiproject.mapper;

import com.stone.multiproject.model.UserDO;
import com.stone.multiproject.model.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(UserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(UserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(UserDO record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(UserDO record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<UserDO> selectByExample(UserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    UserDO selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") UserDO record, @Param("example") UserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(UserDO record);
}
