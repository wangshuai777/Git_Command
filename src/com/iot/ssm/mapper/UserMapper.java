package com.iot.ssm.mapper;

import com.iot.ssm.po.User;
import com.iot.ssm.po.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByExamplePage(UserExample example);

    /**
     * Batch update or insert. Parameters can not be more than 2100
     * list of size not greater than 1000
     */
    void updateBySelectiveBatch(List<User> list);

    void updateBatch(List<User> list);

    void insertBatch(List<User> list);
}