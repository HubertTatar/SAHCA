package com.mycompany.credentialsApp.dao.impl;

import com.mycompany.credentialsApp.dao.RolesDao;
import com.mycompany.credentialsApp.model.Role;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class RolesDaoImpl implements RolesDao {

    @Override
    public List<Role> getAll() {
        return null;
    }
}
