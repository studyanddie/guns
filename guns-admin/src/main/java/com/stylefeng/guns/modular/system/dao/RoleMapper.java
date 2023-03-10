package com.stylefeng.guns.modular.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.guns.core.node.ZTreeNode;
import com.stylefeng.guns.modular.system.model.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
  * 角色表 Mapper 接口
 * </p>
 *
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据条件查询角色列表
     *
     */
    List<Map<String, Object>> selectRoles(@Param("condition") String condition);

    /**
     * 删除某个角色的所有权限
     *
     * @param roleId 角色id
     */
    int deleteRolesById(@Param("roleId") Integer roleId);

    /**
     * 获取角色列表树
     */
    List<ZTreeNode> roleTreeList();

    /**
     * 获取角色列表树
     *
     */
    List<ZTreeNode> roleTreeListByRoleId(String[] roleId);
}