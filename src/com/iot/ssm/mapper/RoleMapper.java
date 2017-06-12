package com.iot.ssm.mapper;

import com.iot.ssm.po.Role;
import com.iot.ssm.po.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    int countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Long roleid);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Long roleid);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> selectByExamplePage(RoleExample example);

    /**
     * Batch update or insert. Parameters can not be more than 2100
     * list of size not greater than 1000
     */
    void updateBySelectiveBatch(List<Role> list);

    void updateBatch(List<Role> list);

    void insertBatch(List<Role> list);
}