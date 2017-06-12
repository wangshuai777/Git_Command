package com.iot.ssm.mapper;

import com.iot.ssm.po.UserRole;
import com.iot.ssm.po.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    int countByExample(UserRoleExample example);

    int deleteByExample(UserRoleExample example);

    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("roleId") Long roleId);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> selectByExample(UserRoleExample example);

    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    List<UserRole> selectByExamplePage(UserRoleExample example);

    /**
     * Batch update or insert. Parameters can not be more than 2100
     * list of size not greater than 1000
     */
    void updateBySelectiveBatch(List<UserRole> list);

    void updateBatch(List<UserRole> list);

    void insertBatch(List<UserRole> list);
}