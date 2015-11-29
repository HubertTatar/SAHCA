package com.mycompany.credentialsApp.controller;

import com.mycompany.credentialsApp.dao.GroupsDao;
import com.mycompany.credentialsApp.model.Group;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class GroupsController {

    private static final Logger LOGGER = Logger.getLogger(GroupsController.class);

    @Autowired
    GroupsDao groupsDao;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Group> list() {
        return groupsDao.getAll();
    }
}
