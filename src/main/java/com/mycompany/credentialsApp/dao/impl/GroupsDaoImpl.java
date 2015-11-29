package com.mycompany.credentialsApp.dao.impl;

import com.mycompany.credentialsApp.dao.GroupsDao;
import com.mycompany.credentialsApp.model.Group;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class GroupsDaoImpl implements GroupsDao {

    @Override
    public List<Group> getAll() {
        return null;
    }
}
