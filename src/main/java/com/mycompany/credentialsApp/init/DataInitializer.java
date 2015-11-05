package com.mycompany.credentialsApp.init;

import com.mycompany.credentialsApp.dao.UserDao;
import com.mycompany.credentialsApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    @Autowired
    private UserDao userDao;

    public void init() {
        User user1 = new User("john.doe", "john.doe@h2.pl");
        User user2 = new User("johanna.doe", "tim.cook@h2.pl");
        User user3 = new User("tim.cook", "tim.cook@h2.pl");

        userDao.create(user1);
        userDao.create(user2);
        userDao.create(user3);
    }
}
