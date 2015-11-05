package com.mycompany.credentialsApp.controller;

import com.mycompany.credentialsApp.dao.UserDao;
import com.mycompany.credentialsApp.model.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private static final Logger LOGGER = Logger.getLogger(UserController.class);

    @Autowired
    UserDao userDao;


    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @Transactional(readOnly = true)
    public @ResponseBody List<User> list () {
        return userDao.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void createUser(@RequestBody User user) {
        userDao.create(user);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void updateUser(@RequestBody User user) {
        userDao.update(user);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> errorHandler(Exception exc) {
        LOGGER.error(exc.getMessage(), exc);
        return new ResponseEntity<>(exc.getMessage(), HttpStatus.BAD_REQUEST);
    }
/*
    *//**
     * Create a new user with an auto-generated id and email and name as passed
     * values.
     *//*
    @RequestMapping(value = "/create")
    @ResponseBody
    public String create(String email, String name) {
        try {
            User user = new User(email, name);
            userDao.create(user);
        } catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created!";
    }

    *//**
     * Delete the user with the passed id.
     *//*
    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(long id) {
        try {
            User user = new User(id);
            userDao.delete(user);
        } catch (Exception ex) {
            return "Error deleting the user: " + ex.toString();
        }
        return "User succesfully deleted!";
    }

    *//**
     * Retrieve the id for the user with the passed email address.
     *//*
    @RequestMapping(value = "/get-by-email")
    @ResponseBody
    public String getByEmail(String email) {
        String userId;
        try {
            User user = userDao.getByEmail(email);
            userId = String.valueOf(user.getId());
        } catch (Exception ex) {
            return "User not found: " + ex.toString();
        }
        return "The user id is: " + userId;
    }

    *//**
     * Update the email and the name for the user indentified by the passed id.
     *//*
    @RequestMapping(value = "/update")
    @ResponseBody
    public String updateName(long id, String email, String name) {
        try {
            User user = userDao.getById(id);
            user.setEmail(email);
            user.setName(name);
            userDao.update(user);
        } catch (Exception ex) {
            return "Error updating the user: " + ex.toString();
        }
        return "User succesfully updated!";
    }*/

}
