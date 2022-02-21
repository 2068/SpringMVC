package com.test.service;

import com.test.domain.Role;

import java.util.List;

public interface RoleService {

    public List<Role> list();

    void save(Role role);
}
