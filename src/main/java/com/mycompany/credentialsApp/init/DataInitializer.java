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
        User user1 = new User("john.doe@h2.pl", "john.doe");
        User user2 = new User("johanna.doe@h2.pl", "johanna.doe");
        User user3 = new User("tim.cook@h2.pl", "tim.cook");
        User user4 = new User("jas.kowalski@gmail.com", "jas.kowalski");
        User user5 = new User("zbigniew.zbigniew@h2.pl", "zbigniews.zbigniew");
        User user6 = new User("mscislaw.dlugonosy@olimp.pl", "mscislaw");
        User user7 = new User("waclaw.zreczny@wp.pl", "waclaw.zreczny");
        User user8 = new User("ilona.ladna@bbb.pl", "ilona.ladna");
        User user9 = new User("ewelina.ponetna@hhas.de", "ewelina.ponetna");

        userDao.create(user1);
        userDao.create(user2);
        userDao.create(user3);
        userDao.create(user4);
        userDao.create(user5);
        userDao.create(user6);
        userDao.create(user7);
        userDao.create(user8);
        userDao.create(user9);
    }
}
