package com.mycompany.credentialsApp.controller;

import com.mycompany.credentialsApp.dao.RolesDao;
import com.mycompany.credentialsApp.model.Role;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolesController {

    private static final Logger LOGGER = Logger.getLogger(RolesController.class);

    @Autowired
    RolesDao rolesDao;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Role> list() {
        return rolesDao.getAll();
    }

}
