package com.sendy.mapper;

import com.sendy.po.Role;

/*
 * @author gethin
 */
public interface RoleMapper {
    public Role getRole(Long id);
    public Role findRole(String roleName);
    public int deleteRole(Long id);
    public int insertRole(Role role);
}
